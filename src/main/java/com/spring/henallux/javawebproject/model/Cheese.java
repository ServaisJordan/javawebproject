package com.spring.henallux.javawebproject.model;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Cheese {
    private Integer id;
    private Double pricePerKilo;
    private String name;
    private String URLImage;

    private Collection<Line> lines;
    private Collection<CheeseLanguage> translations;

    public Cheese() {

    }

    //Setters section
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPricePerKilo(Double price) {
        this.pricePerKilo = price;
    }

    public void setURLImage(String URLImage) {
        this.URLImage = URLImage;
    }

    public void setLines(Collection<Line> lines) {
        this.lines = lines;
    }

    public void setTranslations(Collection<CheeseLanguage> translations) {
        this.translations = translations;
    }

    //Getters section
    public Integer getId() {
        return id;
    }

    public Double getPricePerKilo() {
        return pricePerKilo;
    }

    public String getName() {
        return name;
    }

    public String getURLImage() {
        return URLImage;
    }

    public Collection<Line> getLines() {
        return lines;
    }

    public Collection<CheeseLanguage> getTranslations() {
        return translations;
    }

    public List<CheeseLanguage> getTranslationsList() {return translations.stream().collect(Collectors.toList());}
}
