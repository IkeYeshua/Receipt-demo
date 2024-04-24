package com.example.users;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private final List<TheUser> users = new ArrayList<>();



    public void add(TheUser u){
        users.add(u);
    }

    public void greet(){
        users.forEach(TheUser::greet);
    }
}
