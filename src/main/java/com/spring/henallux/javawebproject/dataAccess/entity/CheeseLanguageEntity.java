package com.spring.henallux.javawebproject.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table(name = "Cheese_Language")
public class CheeseLanguageEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "description")
    private String description;

    @JoinColumn(name = "cheeseId", referencedColumnName = "id")
    @ManyToOne
    private CheeseEntity cheese;
    @JoinColumn(name = "languageId" , referencedColumnName = "id")
    @ManyToOne
    private LanguageEntity language;

    public CheeseLanguageEntity() {

    }

    //Setters section
    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCheeseEntity(CheeseEntity cheese) {
        this.cheese = cheese;
    }

    public void setLanguageEntity(LanguageEntity language) {
        this.language = language;
    }

    //Getters section
    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public CheeseEntity getCheeseEntity() {
        return cheese;
    }

    public LanguageEntity getLanguageEntity() {
        return language;
    }
}
