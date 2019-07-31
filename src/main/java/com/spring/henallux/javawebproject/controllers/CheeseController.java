package com.spring.henallux.javawebproject.controllers;

import com.spring.henallux.javawebproject.model.Cheese;
import com.spring.henallux.javawebproject.services.CheeseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping(value = "/Cheese")
public class CheeseController extends ControllerBase {
    private final CheeseServices cheeseServices;

    @Autowired
    public CheeseController(MessageSource messageSource, CheeseServices cheeseServices) {
        super(messageSource);
        this.cheeseServices = cheeseServices;
    }

    @RequestMapping(value = "/catalog", method = RequestMethod.GET)
    public String catalog(Model model, Locale locale) {
        prepareModel(model, locale);

        List<Cheese> cheeses = (List<Cheese>) cheeseServices.findAll();
        model.addAttribute("cheeses", cheeses);

        return "integrated:catalog";
    }
}
