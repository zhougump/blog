package com.hzz.project.po.user;

/**
 * Created by hong on 2016/12/29.
 */
public class UserCustom extends User {

    private boolean rememberMe;

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }
}
