package com.bookshop.bean;

public class Order {
    private Integer oid;
    private String bookname;
    private Double price;
    private String username;
    private String payment;
    private Integer uid;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Integer getUid() { return uid; }

    public void setUid(Integer uid) { this.uid = uid; }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", bookname='" + bookname + '\'' +
                ", price=" + price +
                ", username='" + username + '\'' +
                ", payment='" + payment + '\'' +
                ", uid=" + uid +
                '}';
    }
}
