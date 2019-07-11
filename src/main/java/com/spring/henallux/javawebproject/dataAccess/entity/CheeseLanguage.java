package com.spring.henallux.javawebproject.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table(name = "Cheese_Language")
public class CheeseLanguage {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "description")
    private String description;

    @JoinColumn(name = "cheeseId", referencedColumnName = "id")
    @ManyToOne
    private Cheese cheese;
    @JoinColumn(name = "languageId" , referencedColumnName = "id")
    @ManyToOne
    private Language language;

    public CheeseLanguage() {

    }

    //Setters section
    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    //Getters section
    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public Language getLanguage() {
        return language;
    }
}
