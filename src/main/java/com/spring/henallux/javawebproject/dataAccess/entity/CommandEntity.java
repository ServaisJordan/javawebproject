package com.spring.henallux.javawebproject.dataAccess.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;


@Entity
@Table(name = "CommandEntity")
public class CommandEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "deliveryDate")
    private Date deliveryDate;
    @Column(name = "creationDate")
    private Date creationDate;

    @JoinColumn(name = "username", referencedColumnName = "username")
    @ManyToOne
    private UserEntity customer;
    @OneToMany(mappedBy = "commandId")
    private Collection<LineEntity> lines;

    public CommandEntity() {

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

    public void setUserName(UserEntity customer) {
        this.customer = customer;
    }

    public void setLine(Collection<LineEntity> lines) {
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

    public UserEntity getCustomer() {
        return customer;
    }

    public Collection<LineEntity> getLineEntities() {
        return lines;
    }
}
