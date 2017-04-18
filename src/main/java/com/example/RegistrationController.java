package com.example;

import com.example.service.RegistrationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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


    private RegistrationService registrationService ;

    @Autowired
    public void setRegistrationService(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

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

            registrationService.save(registerUser);
            System.out.print("getUserId  " + registerUser.getUserId() +
                    " getName  " + registerUser.getName() +
                    " getEmail  " + registerUser.getEmail() +
                    " getPassword  " + registerUser.getPassword());

            registerUser.setUserId(registerUser.getUserId());
            registerUser.setEmail(registerUser.getEmail());
            registerUser.setName(registerUser.getName());
            registerUser.setPassword(registerUser.getPassword());
            registerUser.setAddress(registerUser.getAddress());

            final RegisterUser save = registrationService.save(registerUser);
            System.out.print(" save  " + save);
            System.out.print(" registerUser SAVED :) ");

        } catch (Exception e) {
            logger.error(" Error occurred while trying to process api request", e);

        }

        return "registrationSuccessful";
    }


    @RequestMapping(value = "/registrationSuccessful", method = RequestMethod.GET)
    public String getAllUser(Model model) {
        model.addAttribute("registerUser", new RegisterUser());
        System.out.print("Call to registerUser 1  ");
        return "getUser";
    }

}