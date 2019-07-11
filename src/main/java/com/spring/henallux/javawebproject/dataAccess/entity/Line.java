package com.spring.henallux.javawebproject.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table(name = "Line")
public class Line {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "quantity")
    private Double quantity;

    @JoinColumn(name = "commandId", referencedColumnName = "id")
    @ManyToOne
    private Command command;
    @JoinColumn(name = "cheeseId", referencedColumnName = "id")
    private Cheese cheese;

    public Line() {

    }

    //Setters section
    public void setId(Integer id) {
        this.id = id;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    //Getters section
    public Integer getId() {
        return id;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Command getCommand() {
        return command;
    }

    public Cheese getCheese() {
        return  cheese;
    }
}
