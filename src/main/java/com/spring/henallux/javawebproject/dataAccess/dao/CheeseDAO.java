package com.spring.henallux.javawebproject.dataAccess.dao;

import com.spring.henallux.javawebproject.dataAccess.entity.Cheese;
import com.spring.henallux.javawebproject.dataAccess.repository.CheeseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CheeseDAO {
    private CheeseRepository dataAccess;

    @Autowired
    public CheeseDAO(CheeseRepository cheeseRepository) {
        this.dataAccess = cheeseRepository;
    }

    public Collection<Cheese> getAllCheeses() {
        Collection<Cheese> cheeses = dataAccess.findAll();
        return cheeses;
    }
}
