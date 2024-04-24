package com.example.runapplicaton;

import com.example.users.TheUser;

public class GreetingsApplication {

     public static void main(String[] args) {

         TheUser user1 = new TheUser("Nneka");
         TheUser user2 = new TheUser("Kingsley");

         user1.greet();
         user2.greet();

    }
}
