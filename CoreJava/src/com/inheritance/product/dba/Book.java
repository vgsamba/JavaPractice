package com.inheritance.product.dba;

public class Book extends Product{

    private String auther;

    public Book() {
        super();
        auther="";
        count++;
    }


    public Book(String auther) {
        this.auther = auther;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Override
    public String toString() {
        return "Book{" +
                "auther='" + auther + '\'' +
                '}';
    }
}
