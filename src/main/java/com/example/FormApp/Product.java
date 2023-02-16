package com.example.FormApp;

public class Product {
    private String name;
    private String rollNo;

    public Product(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}
