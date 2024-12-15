package com.bookshop.bean;

public class User {
    private Integer uid;
    private String username;
    private String password;
    private String userkind;

    public User() {
    }

    public User(Integer uid, String username, String password, String userkind) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.userkind = userkind;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserkind() {
        return userkind;
    }

    public void setUserkind(String userkind) {
        this.userkind = userkind;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userkind'" + userkind + '\'' +
                '}';
    }
}