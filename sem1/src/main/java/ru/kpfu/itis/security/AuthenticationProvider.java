package ru.kpfu.itis.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.kpfu.itis.entities.ClientEntity;
import ru.kpfu.itis.entities.PersonalEntity;
import ru.kpfu.itis.repository.ClientRepository;
import ru.kpfu.itis.repository.PersonalRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damir on 02.05.2016.
 */
public class AuthenticationProvider implements org.springframework.security.authentication.AuthenticationProvider {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    PersonalRepository personalRepository;

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();


    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String login = authentication.getName();

        ClientEntity client = clientRepository.findByLogin(login);
        PersonalEntity personal = personalRepository.findByLogin(login);

        if (client == null) {
            if (personal == null) {
                throw new UsernameNotFoundException("user not found");
            }
        }

        String password = authentication.getCredentials().toString();

        if (client != null && client.getPassword() != null) {
            if (!encoder.matches(password, client.getPassword())) {
                throw new BadCredentialsException("invalid password");
            }
        }

        if (personal != null && personal.getPassword() != null) {
            if (!encoder.matches(password, personal.getPassword())) {
                throw new BadCredentialsException("invalid password");
            }
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        if (client != null) {
            authorities.add(new SimpleGrantedAuthority(client.getPosition().toString()));
        }

        if (personal != null) {
            authorities.add(new SimpleGrantedAuthority(personal.getPosition().toString()));
        }

        UsernamePasswordAuthenticationToken person = null;

        if (client != null) {
            person = new UsernamePasswordAuthenticationToken(client, null, authorities);
        }

        if (
        personal!= null) {
            person = new UsernamePasswordAuthenticationToken(personal, null, authorities);
        }

        return person;
    }



    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}
