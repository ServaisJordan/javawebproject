package com.spring.henallux.javawebproject.controllers;

import com.spring.henallux.javawebproject.model.User;
import com.spring.henallux.javawebproject.services.UserServices;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Locale;

@Controller
@RequestMapping(value="/register")
public class RegisterController extends ControllerBase {
    private final UserServices userServices;

    public RegisterController(MessageSource messageSource, UserServices userServices) {
        super(messageSource);
        this.userServices = userServices;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String registerForm(final Model model, Locale locale) {
        model.addAttribute("title", getMessageSource().getMessage("registerFormTitle", null, locale));


        model.addAttribute("user", new User());

        return "integrated:register";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String registerResponse(Model model,
                                   Locale locale,
                                   @Valid @ModelAttribute("user") User user,
                                   BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("title", getMessageSource().getMessage("registerFormTitle", null, locale));
            return "integrated:register";
        }
        try {
            userServices.saveUser(user);
        } catch (Exception e) {
            model.addAttribute("message", getMessageSource().getMessage(e.getClass().toString(), null, locale));
            return "integrated:error";
        }

        return "redirect:hello/say";
    }
}
