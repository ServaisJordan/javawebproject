package com.spring.henallux.javawebproject.controllers;


import com.spring.henallux.javawebproject.model.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.*;


@Controller
@RequestMapping(value = "/login")
public class LoginController extends ControllerBase {

    @Autowired
    public LoginController(MessageSource messageSource) {
        super(messageSource);
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String loginForm(final Model model, Locale locale) {
        prepareModel(model, locale);

        Map<String, String> map = new HashMap<String, String>() {{
            put("submit", getMessageSource().getMessage("submit", null, locale));
            put("username", getMessageSource().getMessage("username", null, locale));
            put("password", getMessageSource().getMessage("password", null, locale));
        }};

        model.addAttribute("loginForm", new LoginForm());
        model.addAllAttributes(map);

        return "integrated:loginForm";
    }

    @RequestMapping(value = "/formResponse", method = RequestMethod.POST)
    public String loginFormResponse(@Valid @ModelAttribute(value = "loginForm") LoginForm response, final BindingResult bindingResult) {
        if (bindingResult.hasErrors()) return "redirect:loginForm";

        return "redirect:/hello/say/"+response.getUsername();
    }
}