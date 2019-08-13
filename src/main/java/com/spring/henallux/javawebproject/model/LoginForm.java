package com.spring.henallux.javawebproject.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginForm {
    @NotNull
    @NotEmpty
    @Pattern(regexp = "^[a-zA-Z''-'\\s]{1,40}$")
    private String username;
    @NotNull
    @NotEmpty
    @Size(min = 6)
    private String password;

    public LoginForm(String username, String password) {
        setUsername(username);
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

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
