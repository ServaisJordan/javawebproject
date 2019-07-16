package com.spring.henallux.javawebproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping(value = "/admin")
public class Admin extends ControllerBase {

    @Autowired
    public Admin(MessageSource messageSource) {
        super(messageSource);
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String adminPage(Model model, Locale locale) {
        prepareModel(model, locale);

        Map<String, String> map = new HashMap<String, String>() {{
            put("adminMessage", getMessageSource().getMessage("adminCertification", null, locale));
            put("title", getMessageSource().getMessage("adminPageTitle", null, locale));
        }};

        model.addAllAttributes(map);

        return "integrated:admin";
    }
}
