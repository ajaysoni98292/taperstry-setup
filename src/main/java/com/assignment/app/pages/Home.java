package com.assignment.app.pages;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.beaneditor.Validate;

import javax.persistence.*;

@Entity
public class Home {

    @Persist("session")
    private String userName;

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
