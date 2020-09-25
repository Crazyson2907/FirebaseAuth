package com.example.firebaseapp4;

public class User {
    public String id, name, sec_name, email;

    private User() {
    }


    public User(String id, String name, String sec_name, String email) {
        this.id = id;
        this.name = name;
        this.sec_name = sec_name;
        this.email = email;
    }
}
