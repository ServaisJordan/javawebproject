package com.spring.henallux.javawebproject.model;

public class LoginForm {
    private String userName;
    private String password;
    private final int TOO_SHORT_VALUE = 6;

    public LoginForm(String userName, String password) throws Exception {
        setUserName(userName);
        setPassword(password);
    }

    public LoginForm() {

    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) throws Exception {
        if (userName.length() < TOO_SHORT_VALUE) throw  new Exception();

        this.userName = userName;
    }

    public void setPassword(String password) throws Exception {
        if (password.length() < TOO_SHORT_VALUE) throw new Exception();

        this.password = password;
    }
}
