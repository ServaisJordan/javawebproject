package com.spring.henallux.javawebproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Controller
@RequestMapping(value="/hello")
public class WelcomeController extends ControllerBase {
    @Autowired
    public WelcomeController(MessageSource messageSource) {
        super(messageSource);
    }

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String hello(final  Model model, Locale locale) {
        return helloBis(model, locale, "world");
    }

    @RequestMapping(value = "/say/{name}", method = RequestMethod.GET)
    public String helloBis(final Model model, Locale locale, @PathVariable(value = "name") String name) {
        model.addAttribute("title", getMessageSource().getMessage("helloPage", null, locale));
        model.addAttribute("welcome", getMessageSource().getMessage("welcome", null, locale));

        model.addAttribute("name", name);

        return "integrated:welcome";
    }
}
