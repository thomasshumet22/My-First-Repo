package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String itemName = "Apples";
        double itemPrice = 2.37;
        int quantity = 3;
        System.out.println("You bought " + quantity + " " + itemName +
                " for $" + (itemPrice * quantity));
    }
}
