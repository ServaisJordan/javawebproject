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
@RequestMapping(value = "/authenticated")
public class Authenticated extends ControllerBase {
    @Autowired
    public Authenticated(MessageSource messageSource) {
        super(messageSource);
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String authenticatedPage(Model model, Locale locale) {
        Map<String, String> map = new HashMap<String, String>() {{
            put("title", getMessageSource().getMessage("authenticatedTitle", null, locale));
            put("authenticatedMessage", getMessageSource().getMessage("authenticatedMessage", null, locale));
        }};

        model.addAllAttributes(map);

        return "integrated:authenticated";
    }
}
