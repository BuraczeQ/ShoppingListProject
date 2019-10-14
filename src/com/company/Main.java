package com.company;

import java.util.Scanner;

public class Main {

        private static Scanner scanner = new Scanner(System.in);
        private static ShoppingList shoppingList = new ShoppingList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        printInstructions();

        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0: printInstructions();
                    break;

                case 1: shoppingList.printShoppingList();
                break;

                case 2: addShoppingItem();
                break;

                case 3: modifyShoppingItem();
                break;

                case 4: removeShoppingItem();
                break;

                case 5: searchShoppingItem();
                break;

                case 6:
                    quit=true;
                    break;
            }
        }


        shoppingList.printShoppingList();
    }
    public static void printInstructions(){
        System.out.println("Press: \n"+
                           "0 to print instruction \n" +
                            "1 to print your list \n"+
                            "2 to add an item \n" +
                            "3 to modify an existing item\n"+
                            "4 to remove an item \n" +
                            "5 to search for an item \n"+
                            "6 to quit the application");
    }
    public static void addShoppingItem(){
        System.out.println("Enter an item that you want to add to the list: ");
        shoppingList.addItem(scanner.nextLine());
         }

     public static void modifyShoppingItem(){
         System.out.println("Enter a position of an item to modify. ");
        int position = scanner.nextInt();
        scanner.nextLine();
         System.out.println("Enter replacement item. ");
        String replacement = scanner.nextLine();
        shoppingList.modifyItem((position-1),replacement);

     }
     public static void removeShoppingItem(){
         System.out.println("Enter an item to remove: ");
         int removePosition = scanner.nextInt();
         scanner.nextLine();
         shoppingList.removeItem((removePosition-1));
     }
     static void searchShoppingItem(){
         System.out.println("Enter an item that you are looking for: ");
         String searchItem = scanner.nextLine();
         if(shoppingList.findItem(searchItem) != null){
             System.out.println("Found " + searchItem + " in your shopping list ");
         }else {
             System.out.println(searchItem + " not on your shopping list.");
         }
     }
}
