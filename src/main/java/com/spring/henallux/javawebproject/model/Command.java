package com.spring.henallux.javawebproject.model;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Date;

public class Command {
    private Integer id;
    private Date deliveryDate;
    private Date creationDate;

    private User customer;
    private Collection<Line> lines;

    public Command() {

    }

    //Setters section
    public void setId(Integer id) {
        this.id = id;
    }

    @NotNull
    @Future
    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public void setLine(Collection<Line> lines) {
        this.lines = lines;
    }

    //Getters section
    public Integer getId() {
        return id;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public User getCustomer() {
        return customer;
    }

    public Collection<Line> getLines() {
        return lines;
    }
}
