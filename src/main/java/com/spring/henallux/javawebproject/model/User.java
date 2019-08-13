package com.spring.henallux.javawebproject.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.*;

public class User extends LoginForm {
    private String authorities;
    private Boolean accountNonExpired;
    private Boolean accountNonLocked;
    private Boolean credentialsNonExpired;
    private Boolean enable;

    @NotNull
    @NotEmpty
    @Pattern(regexp = "^\\D+$")
    @Size(min=6)
    private String name;
    @NotNull
    @NotEmpty
    @Pattern(regexp = "^\\D+$")
    @Size(min=6)
    private String firstName;
    @NotNull
    @NotEmpty
    @Email
    private String email;
    @NotNull
    @NotEmpty
    @Pattern(regexp = "^0[1-68]([-. ]?\\d{2}){4}$")
    private String phoneNumber;
    @NotNull
    @NotEmpty
    @Pattern(regexp = "^\\d{4,5}$")
    private String postalCode;
    @NotNull
    @NotEmpty
    @Pattern(regexp = "^[A-z,' -]+$")
    private String country;
    @NotNull
    @NotEmpty
    @Pattern(regexp = "^(\\d+ ?,? ?)?([A-z', \\d])+ ?(\\d+ ([boite|box] ?\\d))?$")
    private String address;
    @Pattern(regexp = "^[m|f|M|F]$")
    private String gender;
    @Past
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
        this.gender = gender.toString();
    }

    public void setGender(String gender) {this.gender = gender;}

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

    public String getGender() {
        return gender;
    }

    public Collection<Command> getCommands() {
        return commands;
    }

}
