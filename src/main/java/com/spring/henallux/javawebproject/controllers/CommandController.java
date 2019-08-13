package com.spring.henallux.javawebproject.controllers;

import com.spring.henallux.javawebproject.dataAccess.entity.UserEntity;
import com.spring.henallux.javawebproject.model.Cheese;
import com.spring.henallux.javawebproject.model.Command;
import com.spring.henallux.javawebproject.model.Line;
import com.spring.henallux.javawebproject.services.CommandServices;
import com.spring.henallux.javawebproject.utility.Constants;
import org.springframework.security.core.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.*;

@Controller
@RequestMapping("/Command")
@SessionAttributes(Constants.BASKET)
public class CommandController extends ControllerBase {
    private final CommandServices commandServices;

    @Autowired
    public CommandController(CommandServices commandServices, MessageSource messageSource) {
        super(messageSource);
        this.commandServices = commandServices;
    }

    @RequestMapping(value = "/commands", method = RequestMethod.GET)
    public String getCommands(Model model, Locale locale, Authentication authentication) {
        Collection<Command> commands = commandServices.findCommands(
                ((UserEntity) authentication.getPrincipal()).getUsername()
        );
        model.addAttribute("commands", commands);

        return "integrated:commands";
    }

    @RequestMapping(value = "/commandForm", method = RequestMethod.GET)
    public String commandForm(Model model, Locale locale) {
        model.addAttribute("deliveryDate", getMessageSource().getMessage("deliveryDate", null, locale));

        return "integrated:commandForm";
    }

    @RequestMapping(value = "/makeCommand", method = RequestMethod.POST)
    public String makeCommand(Model model,
                              Locale locale,
                              @ModelAttribute(value=Constants.BASKET) HashMap<Cheese, Double> basket,
                              @ModelAttribute("deliveryDate") Date deliveryDate) throws Exception {
        Command command = new Command() {{
            setDeliveryDate(deliveryDate);
            setCreationDate(new Date());
        }};

        Collection<Line> lines = new ArrayList<>();

        for (Map.Entry<Cheese, Double> basketEntry : basket.entrySet()) {
            lines.add(new Line() {{
                setQuantity(basketEntry.getValue());
                setCheese(basketEntry.getKey());
            }});
        }

        command.setLine(lines);
        commandServices.saveCommand(command);

        return "integrated:makeCommandSuccess";
    }
}
