package com.company;

import GeneralUI.Home;
import PaymentControl.User;

public class Main {

    public static void main(String[] args) {
        User user = new User("Nada@gmail.com", "123", "nada", "Admin");
        user.addToDatabase();
        Home start = new Home();
        start.initializeForm();

    }
}
