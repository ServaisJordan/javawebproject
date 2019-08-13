package com.spring.henallux.javawebproject.controllers;

import com.spring.henallux.javawebproject.model.Cheese;
import com.spring.henallux.javawebproject.utility.Constants;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping(value="Basket")
@SessionAttributes({Constants.BASKET})
public class BasketController extends ControllerBase {
    public BasketController(MessageSource messageSource) {
        super(messageSource);
    }

    @ModelAttribute(Constants.BASKET)
    public HashMap<Cheese, Double> basket() {
        return new HashMap<>();
    }

    @RequestMapping(value="basket", method = RequestMethod.GET)
    public String getBasket(Model model, Locale locale) {
        model.addAttribute("title", getMessageSource().getMessage("basketPageTitle", null, locale));

        return "integrated:basket";
    }

    @RequestMapping(value="addToBasket", method = RequestMethod.POST)
    public String addToBasket(Model model,
                              Locale locale,
                              @ModelAttribute(value="quantity") double quantity,
                              @ModelAttribute(value="cheese") Cheese cheese,
                              @ModelAttribute(value = Constants.BASKET) HashMap<Cheese, Double> basket) {
        basket.put(cheese, quantity);

        return "integrated:addToBasketSuccess";
    }
}
