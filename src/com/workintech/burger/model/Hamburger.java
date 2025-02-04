package com.workintech.burger.model;

public class Hamburger {
    protected String name;
    protected String meat;
    protected double price;
    protected BreadRollType breadRollType;

    // ek malzemeler için:

    protected String addition1Name;
    protected double addition1Price;
    protected String addition2Name;
    protected double addition2Price;
    protected String addition3Name;
    protected double addition3Price;
    protected String addition4Name;
    protected double addition4Price;

    public Hamburger(String name, double price, BreadRollType breadRollType) {
        this.name = name;
        this.meat = "Normal";
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double totalPrice = this.price;
        System.out.println("Name: " + this.name);
        System.out.println("Meat: " + this.meat);
        System.out.println("BreadRollType: " + this.breadRollType);
        if (addition1Name != null) {
            System.out.println("Addition1: " + this.addition1Name);
            totalPrice += this.addition1Price;
        }
        if (addition2Name != null) {
            System.out.println("Addition2: " + this.addition2Name);
            totalPrice += this.addition2Price;
        }
        if (addition3Name != null) {
            System.out.println("Addition3: " + this.addition3Name);
            totalPrice += this.addition3Price;
        }
        if (addition4Name != null) {
            System.out.println("Addition4: " + this.addition4Name);
            totalPrice += this.addition4Price;
        }
        System.out.println("Price: " + totalPrice);
        return totalPrice;
    }

}
