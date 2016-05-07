package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.entities.GeneralUserEntity;
import ru.kpfu.itis.service.PersonalService;


/**
 * Created by Damir on 02.05.2016.
 */
@Controller
public class ProfilePageController {
    @Autowired
    PersonalService personalService;

    @RequestMapping(method = RequestMethod.GET)
    public String getLogin(Model model) {
        return "redirect:/login";
    }


    @RequestMapping(value = "/profile")
    public String getProfilePage(Model model) {
        GeneralUserEntity user = (GeneralUserEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("user", user);
        return "profile";
    }


}
