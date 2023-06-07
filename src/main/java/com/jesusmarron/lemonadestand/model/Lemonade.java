package com.jesusmarron.lemonadestand.model;

public class Lemonade {
    private double lemonJuice;
    private double water;
    private double sugar;
    private int iceCubes;
    private final int CUP = 1;
    private double price;

    public double getLemonJuice() {
        return lemonJuice;
    }

    public Lemonade(double lemonJuice, double water, double sugar, int iceCubes) {
        this.lemonJuice = lemonJuice;
        this.water = water;
        this.sugar = sugar;
        this.iceCubes = iceCubes;
        calculatePrice();
    }

    private void calculatePrice(){
        price = (lemonJuice * .3) + (sugar * .15) + (CUP * .5);
    }

    public void setLemonJuice(double lemonJuice) {
        this.lemonJuice = lemonJuice;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public int getIceCubes() {
        return iceCubes;
    }

    public void setIceCubes(int iceCubes) {
        this.iceCubes = iceCubes;
    }

    public double getPrice() {
        return price;
    }

    public int getCUP() {
        return CUP;
    }
}
