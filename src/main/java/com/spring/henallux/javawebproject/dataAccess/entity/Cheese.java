package com.spring.henallux.javawebproject.dataAccess.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Cheese")
public class Cheese {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "pricePerKilo")
    private Double pricePerKilo;
    @Column(name = "name")
    private String name;
    @Column(name = "URLImage")
    private String URLImage;

    @OneToMany(mappedBy = "cheeseId")
    private Collection<Line> lines;
    @OneToMany(mappedBy = "cheeseId")
    private Collection<CheeseLanguage> translations;

    public Cheese() {

    }

    //Setters section
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) throws Exception {
        this.name = name;
    }

    public void setPricePerKilo(Double price) throws Exception {
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
}
