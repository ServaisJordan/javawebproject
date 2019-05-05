package com.spring.henallux.javawebproject.controllers;


import com.spring.henallux.javawebproject.model.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping(value = "/login")
public class Login extends ControllerBase {

    @Autowired
    public Login(MessageSource messageSource) {
        setMessageSource(messageSource);
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String loginForm(Model model, Locale locale) {
        Map<String, String> map = new HashMap<>();
        map.put("submit", getMessageSource().getMessage("submit", null, locale));
        map.put("username", getMessageSource().getMessage("username", null, locale));
        map.put("password", getMessageSource().getMessage("password", null, locale));

        model.addAttribute("loginForm", new LoginForm());
        model.addAllAttributes(map);

        return "integrated:loginForm";
    }

    @RequestMapping(value = "/formResponse", method = RequestMethod.POST)
    public String loginFormResponse(@ModelAttribute(value = "loginForm") LoginForm response) {
        return "redirect:/hello/say/"+response.getUserName();
    }
}
