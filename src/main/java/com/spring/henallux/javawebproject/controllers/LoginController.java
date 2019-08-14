package com.spring.henallux.javawebproject.controllers;

import com.spring.henallux.javawebproject.dataAccess.entity.UserEntity;
import com.spring.henallux.javawebproject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/login")
public class LoginController extends ControllerBase {

    @Autowired
    public LoginController(MessageSource messageSource) {
        super(messageSource);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String loginForm(final Model model) {
        model.addAttribute("loginForm", new UserEntity());

        return "integrated:loginForm";
    }
}
