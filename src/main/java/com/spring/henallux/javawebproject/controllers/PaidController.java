package com.spring.henallux.javawebproject.controllers;

import com.spring.henallux.javawebproject.model.Order;
import com.spring.henallux.javawebproject.services.OrderServices;
import com.spring.henallux.javawebproject.utility.AddDays;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
@RequestMapping(value = "/paid")
public class PaidController extends ControllerBase {
    private final OrderServices orderServices;

    public PaidController(MessageSource messageSource, OrderServices orderServices) {
        super(messageSource);
        this.orderServices = orderServices;
    }

    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    public String paid(@PathVariable("id") String id) throws Exception {
        try {
            int convertedId = Integer.valueOf(id);
            Order order = orderServices.findOrder(convertedId);
            order.setIsPay(true);
            order.setDeliveryDate(AddDays.addDays(new Date(), 3));
            orderServices.saveOrder(order);

            return "integrated:paid";
        } catch (Exception e) {
            return "redirect:../";
        }
    }
}
