package com.spring.henallux.javawebproject.model;

public class Cheese {
    private Integer id;
    private Double price;
    private String name;

    public Cheese() {

    }

    public Cheese(Integer id, Double price, String name) throws Exception {
        setId(id);
        setPrice(price);
        setName(name);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) throws Exception {
        if (name.length() < 3) throw new Exception();
        this.name = name;
    }

    public void setPrice(Double price) throws Exception {
        if (price < 1) throw  new Exception();
        this.price = price;
    }
}
