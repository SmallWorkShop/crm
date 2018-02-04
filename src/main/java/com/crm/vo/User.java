package com.crm.vo;

public class User {
    private Integer userid;

    private String useraccont;

    private String username;

    private String upassword;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUseraccont() {
        return useraccont;
    }

    public void setUseraccont(String useraccont) {
        this.useraccont = useraccont == null ? null : useraccont.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }
}