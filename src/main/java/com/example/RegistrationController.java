package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.RegistrationService;

/**
 * Created by nara1016 on 10-04-2017.
 */

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService ;

  private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);


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

        try {

            System.out.print("registerUser  "+registerUser.toString());
            registrationService.save(registerUser);
            System.out.print("registerUser SAVED :) ");

        } catch (Exception e) {
            logger.error("Error occurred while trying to process api request", e);

        }

        return "registrationSuccessful";
    }


}