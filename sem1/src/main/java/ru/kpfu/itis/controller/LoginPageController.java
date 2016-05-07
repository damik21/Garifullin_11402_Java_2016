package ru.kpfu.itis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Damir on 02.05.2016.
 */
@Controller
@RequestMapping("/login")
public class LoginPageController {

    @RequestMapping(method = RequestMethod.GET)
    public String getLogin() {
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String getLoginPage(@RequestParam(value = "error", required = false) Boolean error, Model model) {
        if (Boolean.TRUE.equals(error)) {
            System.out.println(error);
            model.addAttribute("error", error);
        }
        return "login";
    }

}
