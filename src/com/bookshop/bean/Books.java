package com.bookshop.bean;

public class Books {

    private Integer bid;
    private String bookname;
    private String author;
    private String date;
    private String sort;
    private Double price;


    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bid=" + bid +
                ", bookname='" + bookname + '\'' +
                ", author=" + author +
                ", date=" + date +
                ", sort=" + sort +
                ", price='" + price + '\'' +
                '}';
    }
}