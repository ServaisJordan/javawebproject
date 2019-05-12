package com.spring.henallux.javawebproject.controllers;


import org.springframework.context.MessageSource;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


public abstract class ControllerBase {

    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Model prepareModel(Model model, Locale locale) {
        Map<String, String> map = new HashMap<String, String>() {{
            put("signin", messageSource.getMessage("signin", null, locale));
            put("signup", messageSource.getMessage("signup", null, locale));
        }};

        return model.addAllAttributes(map);
    }
}
