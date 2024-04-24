package com.example.users;


public class TheUser {
    private String name;

    public TheUser(String name){
        this.name = name;
    }
   public void greet(){
       System.out.println("hello, " + name);
   }
}
