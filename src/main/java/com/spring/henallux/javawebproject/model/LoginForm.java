package com.spring.henallux.javawebproject.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginForm {
    private String username;
    private String password;

    public LoginForm(String username, String password) {
        setUserName(username);
        setPassword(password);
    }

    public LoginForm() {

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @NotNull
    @Pattern(regexp = "^[a-zA-Z''-'\\s]{1,40}$")
    public void setUserName(String username) {
        this.username = username;
    }

    @NotNull
    @Size(min = 6)
    public void setPassword(String password) {
        this.password = password;
    }
}
