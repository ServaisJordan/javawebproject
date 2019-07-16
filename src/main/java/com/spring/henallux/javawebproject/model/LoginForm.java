package com.spring.henallux.javawebproject.model;

public class LoginForm {
    private String username;
    private String password;
    private final int TOO_SHORT_VALUE = 6;

    public LoginForm(String userName, String password) throws Exception {
        setUserName(userName);
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

    public void setUserName(String userName) throws Exception {
        if (userName.length() < TOO_SHORT_VALUE) throw  new Exception();

        this.username = username;
    }

    public void setPassword(String password) throws Exception {
        if (password.length() < TOO_SHORT_VALUE) throw new Exception();

        this.password = password;
    }
}
