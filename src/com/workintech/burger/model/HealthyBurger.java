package com.workintech.burger.model;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, price, breadRollType);
        this.meat = "Tofu";
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

