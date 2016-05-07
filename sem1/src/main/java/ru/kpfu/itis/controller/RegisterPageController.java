package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.form.RegisterForm;
import ru.kpfu.itis.service.ClientService;

import javax.validation.Valid;

/**
 * Created by Damir on 02.05.2016.
 */
@Controller
@RequestMapping("/register")
public class RegisterPageController {
    @Autowired
    ClientService clientService;

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public String getClientRegistrationPage(Model model){
        model.addAttribute("clientform", new RegisterForm());
        return "register";
    }

    @RequestMapping(value = "/client", method = RequestMethod.POST)
    public String getClientRegistration(@ModelAttribute("clientform") @Valid RegisterForm registerForm, BindingResult result){

        if (result.hasErrors()) {
            return "register";
        }

        clientService.registerClient(registerForm);
        return "redirect:/login";
    }
}
