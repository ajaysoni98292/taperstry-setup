package com.assignment.app.pages;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.PasswordField;
import org.apache.tapestry5.corelib.components.TextField;
import org.hibernate.Session;

import javax.inject.Inject;

public class Index {

    @Property
    private String userName;

    @Property
    private String password;

    // Other pages

    @Component(id = "loginForm")
    private Form loginForm;

    @Component(id = "userName")
    private TextField userNameField;

    @Component(id = "password")
    private PasswordField passwordField;

    @InjectPage
    private Home home;

    @Inject
    private Session session;

    void onValidateFromLoginForm() {
        if (userName == null || userName.trim().equals("") || !userName.trim().equals("ajay.soni@instantsys.com")) {
            loginForm.recordError(userNameField, "Please enter valid username");
        }
        if (password == null || password.trim().equals("") || !password.trim().equals("12345")) {
            loginForm.recordError(passwordField, "Please enter valid password.");
        }
    }
    Object onSuccessFromLoginForm() {

        home.setUserName(userName);
        return home;
    }
}
