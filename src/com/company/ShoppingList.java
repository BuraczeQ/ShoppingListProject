package com.company;

import java.util.ArrayList;

public class ShoppingList {

    private ArrayList<String> myShoppingList = new ArrayList<String>();



    public void printShoppingList(){
        System.out.println("On your shopping list there is: "  + myShoppingList.size() + " items.");

        for(int i = 0; i<myShoppingList.size(); i++){
            System.out.println("Your Item nr. " + (i+1) + " ---> " + myShoppingList.get(i));
        }
    }
    public void addItem(String item){
        myShoppingList.add(item);
        System.out.println("Adding " +  item + " to your shopping list");
    }

    public void modifyItem(int position, String ItemName){
        myShoppingList.set(position,ItemName);
        System.out.println("Your shopping list has been modified at position " + (position+1));
    }

    public void removeItem(int position){
        String removedItemName = myShoppingList.get(position);
        System.out.println("Removing an item at position: " + (position+1) + " item name: " + removedItemName);
        myShoppingList.remove(position);
    }
    public String findItem(String item){
        int itemIndex = myShoppingList.indexOf(item);
        if (itemIndex >= 0){
            return myShoppingList.get(itemIndex);
        }
        return null;
    }

}
