package com.spring.henallux.javawebproject.model;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Line {
    private Integer id;
    private Double quantity;

    private Command command;
    private Cheese cheese;

    public Line() {

    }

    //Setters section
    public void setId(Integer id) {
        this.id = id;
    }

    @NotNull
    @Min(value = 0)
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
