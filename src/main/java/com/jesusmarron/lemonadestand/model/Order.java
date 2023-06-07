package com.jesusmarron.lemonadestand.model;

import java.util.Arrays;

public class Order {
    private Customer customer;
    private Lemonade[] lemonades;
    private double total;

    public Order(Customer customer) {
        this.customer = customer;
        lemonades = new Lemonade[0];
    }

    private void updateTotal() {
        total = 0;
        for (Lemonade l : lemonades) {
            total += l.getPrice();
        }
    }

    public void addLemonade(Lemonade lemonade) {
       Lemonade[] temp = Arrays.copyOf(lemonades, lemonades.length+1);

       temp[temp.length-1] = lemonade;
       lemonades = temp;

       updateTotal();
    }

    public Customer getCustomer() {
        return customer;
    }

    public Lemonade[] getLemonades() {
        return lemonades;
    }

    public double getTotal() {
        return total;
    }
}
