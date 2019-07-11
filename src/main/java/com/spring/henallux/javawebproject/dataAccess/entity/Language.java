package com.spring.henallux.javawebproject.dataAccess.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Language")
public class Language {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "languageId")
    private Collection<CheeseLanguage> descriptions;

    public Language() {

    }

    //Setters section
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescriptions(Collection<CheeseLanguage> descriptions) {
        this.descriptions = descriptions;
    }

    //Getters section
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<CheeseLanguage> getDescriptions() {
        return descriptions;
    }
}
