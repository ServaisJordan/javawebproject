package com.spring.henallux.javawebproject.dataAccess.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;


@Entity
@Table(name = "Command")
public class Command {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "deliveryDate")
    private Date deliveryDate;
    @Column(name = "creationDate")
    private Date creationDate;

    @JoinColumn(name = "username", referencedColumnName = "username")
    @ManyToOne
    private User customer;
    @OneToMany(mappedBy = "commandId")
    private Collection<Line> lines;

    public Command() {

    }

    //Setters section
    public void setId(Integer id) {
        this.id = id;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setUserName(User customer) {
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
