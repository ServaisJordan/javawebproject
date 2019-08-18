package com.spring.henallux.javawebproject.controllers;

import com.spring.henallux.javawebproject.model.BasketEntry;
import com.spring.henallux.javawebproject.model.Cheese;
import com.spring.henallux.javawebproject.model.CheeseLanguage;
import com.spring.henallux.javawebproject.services.CheeseLanguageServices;
import com.spring.henallux.javawebproject.services.CheeseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping(value = "/catalog")
public class CatalogController extends ControllerBase {
    private final CheeseServices cheeseServices;
    private final CheeseLanguageServices cheeseLanguageServices;

    @Autowired
    public CatalogController(MessageSource messageSource,
                             CheeseServices cheeseServices,
                             CheeseLanguageServices cheeseLanguageServices) {
        super(messageSource);
        this.cheeseServices = cheeseServices;
        this.cheeseLanguageServices =cheeseLanguageServices;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String catalog(Model model) {
        List<Cheese> cheeses = (List<Cheese>) cheeseServices.findAll();
        model.addAttribute("cheeses", cheeses);
        return "integrated:catalog";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String cheese(@PathVariable(value = "id") String id, Model model, Locale locale) {
        try {
            int idConverted = Integer.valueOf(id);
            CheeseLanguage cheeseLanguage = cheeseLanguageServices.findCheese(idConverted, locale);

            BasketEntry basketEntry = new BasketEntry() {{
                setCheeseId(cheeseLanguage.getCheese().getId());
                setQuantity(0.);
            }};

            if (!model.containsAttribute("basketEntry"))
                model.addAttribute("basketEntry", basketEntry);

            model.addAttribute("cheeseLanguage", cheeseLanguage);

            return "integrated:cheese";
        } catch (Exception e) {
            return "redirect:../";
        }

    }
}
