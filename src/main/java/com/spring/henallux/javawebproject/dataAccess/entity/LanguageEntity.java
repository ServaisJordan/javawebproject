package com.spring.henallux.javawebproject.dataAccess.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "LanguageEntity")
public class LanguageEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "languageId")
    private Collection<CheeseLanguageEntity> descriptions;

    public LanguageEntity() {

    }

    //Setters section
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescriptions(Collection<CheeseLanguageEntity> descriptions) {
        this.descriptions = descriptions;
    }

    //Getters section
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<CheeseLanguageEntity> getDescriptions() {
        return descriptions;
    }
}
