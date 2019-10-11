package com.company;

public class Main {

    public static void main(String[] args) {

        ShoppingList shoppingList = new ShoppingList();
        shoppingList.addItem("Masło");
        shoppingList.addItem("Gówno");
        shoppingList.addItem("Morela");
        shoppingList.addItem("Bletki");


        shoppingList.removeItem(2);


        shoppingList.printShoppingList();
    }
}
