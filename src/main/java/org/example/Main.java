package org.example;

public class Main {
    public static void main(String[] args) {

        Drink myDrink = new Drink("Mate", "Wasser, Zucker, Kräutermischung", "5865164", true);

        Drink florianDrink = new Drink( "Wasser", "Wasser", "0815", true);

        System.out.println(myDrink.ingredients);

    }
}