package com.workintech.burger.main;

import com.workintech.burger.model.BreadRollType;
import com.workintech.burger.model.DeluxeBurger;
import com.workintech.burger.model.Hamburger;
import com.workintech.burger.model.HealthyBurger;

public class Main {
    public static void main(String[] args) {
        System.out.println("******************************************************");
        Hamburger hamburger = new Hamburger("Basic", 3.56, BreadRollType.WRAP);
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        hamburger.itemizeHamburger();

        System.out.println("******************************************************");
        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, BreadRollType.SANDWICH);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        healthyBurger.itemizeHamburger();

        System.out.println("******************************************************");
        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        db.itemizeHamburger();

    }
}