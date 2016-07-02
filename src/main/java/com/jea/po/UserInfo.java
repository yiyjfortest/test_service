package com.jea.po;

import java.util.Date;

public class UserInfo {
    private Long userId;

    private String userName;

    private String userPassword;

    private Date creatTime;

    private String userInfocol;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getUserInfocol() {
        return userInfocol;
    }

    public void setUserInfocol(String userInfocol) {
        this.userInfocol = userInfocol == null ? null : userInfocol.trim();
    }
}