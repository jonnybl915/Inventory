package com.theironyard.jdblack;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<InventoryItem> itemList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryItem wand = new InventoryItem("wand", 2);
        InventoryItem tome = new InventoryItem("tome", 3);
        itemList.add(wand);
        itemList.add(tome);

        for (InventoryItem item : itemList) {
            System.out.println((itemList.indexOf(item) +1) +"." + " [" + item.amount + "]" + " " + item.item + "(s)");
        }

        while (true) {
            System.out.println("1. Create new Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Quantity");
            String option = scanner.nextLine();
            if (option.equalsIgnoreCase("1")){
                System.out.println("Please type new Item Name");
                String newItem = scanner.nextLine();
                System.out.println("Please type new Item Amount");
                String newAmount = scanner.nextLine();
                InventoryItem item = new InventoryItem(newItem, Integer.valueOf(newAmount));
                itemList.add(item);
                System.out.println((itemList.indexOf(item) +2) +"." + " [" + newAmount + "]" + " " + newItem + "(s)");
            }
            else if(option.equalsIgnoreCase("2")){

                System.out.println("Please select item number to delete");
                for (InventoryItem item : itemList) {
                    System.out.println((itemList.indexOf(item) + 1) + "." + " [" + item.amount + "]" + " " + item.item + "(s)");
                }
                String choice = scanner.nextLine();
                int num = Integer.valueOf(choice);
                itemList.remove(num-1);
                System.out.println();

            }

        }
    }

}
