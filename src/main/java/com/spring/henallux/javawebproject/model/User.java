package com.spring.henallux.javawebproject.model;

public class User extends LoginForm {
    private Integer age;

    public User() {

    }

    public User(Integer age) throws Exception {
        setAge(age);
    }

    public void setAge(Integer age) throws Exception {
        if (age < 18) throw new Exception();
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
}
