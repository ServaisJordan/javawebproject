package com.spring.henallux.javawebproject.model;

public class User extends LoginForm {
    private Integer age;
    private String username;

    public User() {

    }

    public User(Integer age) throws Exception {
        setAge(age);
    }

    public void setAge(Integer age) throws Exception {
        if (age < 18) throw new Exception();
        this.age = age;
    }

    public void setUsername(String username) throws Exception {
        if (username.length() < 3) throw new Exception();
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }
}
