package com.spring.henallux.javawebproject.services;


import com.spring.henallux.javawebproject.model.Cheese;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CheeseServices {

    public List<Cheese> getAllCheeses() {
        return new ArrayList<>();
    }

    public Cheese getCheese(int id) throws Exception {
        return new Cheese();
    }

    public boolean deleteCheese(int id) {
        return true;
    }
}
