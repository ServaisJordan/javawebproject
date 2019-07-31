package com.spring.henallux.javawebproject.controllers;


import org.springframework.context.MessageSource;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


public abstract class ControllerBase {

    private MessageSource messageSource;

    public ControllerBase(MessageSource messageSource) {
        setMessageSource(messageSource);
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Model prepareModel(final Model model, Locale locale) {
        Map<String, String> map = new HashMap<String, String>() {{
            put("adminPageTitle", messageSource.getMessage("adminPageTitle", null, locale));
            put("authenticatedPageTitle", messageSource.getMessage("authenticatedPageTitle", null, locale));
            put("signin", messageSource.getMessage("signin", null, locale));
            put("signup", messageSource.getMessage("signup", null, locale));
        }};

        return model.addAllAttributes(map);
    }
}
