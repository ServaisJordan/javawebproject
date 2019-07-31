package com.spring.henallux.javawebproject.model;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.*;

public class User extends LoginForm {
    private String authorities;
    private Boolean accountNonExpired;
    private Boolean accountNonLocked;
    private Boolean credentialsNonExpired;
    private Boolean enable;

    private String name;
    private String firstName;
    private String email;
    private String phoneNumber;
    private String postalCode;
    private String country;
    private String address;
    private Character gender;
    private Date birthDate;

    private Collection<Command> commands;

    public User() {

    }

    public String getAuthorities() {
        return authorities;
    }

    //Setters section
    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public void setAccountNonExpired(Boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public void setAccountNonLocked(Boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @NotNull
    @Pattern(regexp = "^\\D+$")
    @Size(min=6)
    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @NotNull
    @Email
    public void setEmail(String email) {
        this.email = email;
    }

    @NotNull
    @Pattern(regexp = "^0[1-68]([-. ]?\\d{2}){4}$")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @NotNull
    @Pattern(regexp = "^\\d{4,5}$")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @NotNull
    @Pattern(regexp = "^[A-z,' -]+$")
    public void setCountry(String country) {
        this.country = country;
    }

    @NotNull
    @Pattern(regexp = "^(\\d+ ?,? ?)?([A-z', \\d])+ ?(\\d+ ([boite|box] ?\\d))?$")
    public void setAddress(String address) {
        this.address = address;
    }

    @Pattern(regexp = "^[m|f|M|F]$")
    public void setGender(Character gender) {
        this.gender = gender;
    }

    @Past
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setCommands(Collection<Command> commands) {
        this.commands = commands;
    }

    //Getters section
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public boolean isEnabled() {
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
