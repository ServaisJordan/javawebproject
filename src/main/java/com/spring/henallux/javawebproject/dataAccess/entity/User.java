package com.spring.henallux.javawebproject.dataAccess.entity;

import com.spring.henallux.javawebproject.model.LoginForm;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "User")
public class User extends LoginForm {
    @Id
    @Column(name = "userName")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "authorities")
    private String authorities;
    @Column(name = "NON_EXPIRED")
    private Boolean nonExpired;
    @Column(name = "NON_LOCKED")
    private Boolean nonLocked;
    @Column(name = "CREDENTIAL_NON_EXPIRED")
    private Boolean credentialsNonExpired;
    @Column(name = "enable")
    private Boolean enable;

    @Column(name = "name")
    private String name;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "email")
    private String email;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "postalCode")
    private String postalCode;
    @Column(name = "country")
    private String country;
    @Column(name = "address")
    private String address;
    @Column(name = "gender")
    private Character gender;
    @Column(name = "birthDate")
    private Date birthDate;

    @OneToMany(mappedBy = "userName")
    private Collection<Command> commands;

    public User() {

    }

    //TODO setter + getter
    //Setters section
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public void setNonExpired(Boolean nonExpired) {
        this.nonExpired = nonExpired;
    }

    public void setNonLocked(Boolean nonLocked) {
        this.nonLocked = nonLocked;
    }

    public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setCommands(Collection<Command> commands) {
        this.commands = commands;
    }

    //Getters section
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAuthorities() {
        return authorities;
    }

    public Boolean getNonExpired() {
        return nonExpired;
    }

    public Boolean getNonLocked() {
        return nonLocked;
    }

    public Boolean getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public Boolean getEnable() {
        return enable;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Character getGender() {
        return gender;
    }

    public Collection<Command> getCommands() {
        return commands;
    }
}
