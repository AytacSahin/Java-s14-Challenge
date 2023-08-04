package com.workintech.burger.model;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe Burger", 19.1, "Double Sandwich");
        this.meat = "Double";
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Malzeme ekleyemezsin!");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Malzeme ekleyemezsin!");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Malzeme ekleyemezsin!");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Malzeme ekleyemezsin!");
    }
}
