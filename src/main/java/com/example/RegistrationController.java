package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by nara1016 on 10-04-2017.
 */
@Controller
public class RegistrationController {

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerUser(Model model) {
        model.addAttribute("registerUser", new RegisterUser());
        System.out.print("Call to registerUser 1  ");
        return "registrationForm";
    }

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public String registerUserSubmit(@ModelAttribute RegisterUser registerUser, Model model) {
        model.addAttribute("registerUser", registerUser);
        System.out.print("registerUser Call 2  ");
        return "registrationSuccessful";
    }


}