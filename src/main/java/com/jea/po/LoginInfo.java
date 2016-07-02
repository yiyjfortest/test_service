package com.jea.po;

import java.util.Date;

public class LoginInfo {
    private Long id;

    private Long userId;

    private Date loginTime;

    private String loginInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(String loginInfo) {
        this.loginInfo = loginInfo == null ? null : loginInfo.trim();
    }
}