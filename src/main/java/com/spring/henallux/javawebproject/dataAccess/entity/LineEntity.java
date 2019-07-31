package com.spring.henallux.javawebproject.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table(name = "LineEntity")
public class LineEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "quantity")
    private Double quantity;
    @Column(name = "pricePerKilo")
    private Double pricePerKilo;

    @JoinColumn(name = "commandId", referencedColumnName = "id")
    @ManyToOne
    private CommandEntity command;
    @JoinColumn(name = "cheeseId", referencedColumnName = "id")
    private CheeseEntity cheese;

    public LineEntity() {

    }

    //Setters section
    public void setId(Integer id) {
        this.id = id;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public void setPricePerKilo(Double pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
    }

    public void setCommandEntity(CommandEntity command) {
        this.command = command;
    }

    public void setCheeseEntity(CheeseEntity cheese) {
        this.cheese = cheese;
    }

    //Getters section
    public Integer getId() {
        return id;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Double getPricePerKilo() {
        return pricePerKilo;
    }

    public CommandEntity getCommandEntity() {
        return command;
    }

    public CheeseEntity getCheeseEntity() {
        return cheese;
    }
}
