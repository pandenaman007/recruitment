package com.consuma.appblog.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userdb")
public class MessageRetrival {
    private String name;
    private String email;
    private String Password;

    public MessageRetrival() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
