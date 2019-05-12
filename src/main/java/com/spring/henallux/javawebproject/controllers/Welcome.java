package com.spring.henallux.javawebproject.controllers;

import com.spring.henallux.javawebproject.services.CheeseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping(value="/hello")
public class Welcome extends ControllerBase {
    private final CheeseServices cheeseServices;
    @Autowired
    public Welcome(MessageSource messageSource, CheeseServices cheeseServices) {
        setMessageSource(messageSource);
        this.cheeseServices = cheeseServices;
    }

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String hello(final  Model model, Locale locale) {
        return helloBis(model, locale, "world");
    }

    @RequestMapping(value = "/say/{name}", method = RequestMethod.GET)
    public String helloBis(final Model model, Locale locale, @PathVariable(value = "name") String name) {
        prepareModel(model, locale);

        Map<String, String> map = new HashMap<String, String>() {{
            put("title", getMessageSource().getMessage("helloPage", null, locale));
            put("welcome", getMessageSource().getMessage("welcome", null, locale));
        }};

        model.addAllAttributes(map);
        model.addAttribute("name", name);

        return "integrated:welcome";
    }
}
