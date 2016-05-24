package com.theironyard.jdblack;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<InventoryItem> itemList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (InventoryItem item : itemList) {
            System.out.printf("%s . [ %s ] %s(s) [%s]\n", (itemList.indexOf(item) +1), item.amount, item.item, item.category);
        }

        while (true) {
            System.out.println("1. Create new Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Quantity");
            System.out.println("4. List Items");
            String option = scanner.nextLine();
            if (option.equalsIgnoreCase("1")) {

                System.out.println("Please type new Item Name");
                String newItem = scanner.nextLine();
                System.out.println("Please type new Item Amount");
                String newAmount = scanner.nextLine();
                int amount = Integer.valueOf(newAmount);
                System.out.println("Please select the Category of new item.");
                System.out.println("[1.] Weapon");
                System.out.println("[2.] Food");
                System.out.println("[3.] ReadingMaterial");
                System.out.println("[4.] Medicine");
                System.out.println("[5.] Armor");
                String newCategory = scanner.nextLine();
                InventoryItem item = createItem(newItem, amount, newCategory);
                itemList.add(item);

            }
            else if(option.equalsIgnoreCase("2")){

                System.out.println("Please select the item number to delete");
                for (InventoryItem item : itemList) {
                    System.out.printf("%s . [ %s ] %s(s) [%s]\n", (itemList.indexOf(item) +1), item.amount, item.item, item.category);
                }
                String choice = scanner.nextLine();
                int num = Integer.valueOf(choice);
                itemList.remove(num-1);
                System.out.println();
            }
            else if(option.equalsIgnoreCase("3")){

                System.out.println("Please select which item's quantity you wish to update");
                for (InventoryItem item : itemList) {
                    System.out.printf("%s . [ %s ] %s(s) [%s]\n", (itemList.indexOf(item) +1), item.amount, item.item, item.category);
                }
                String choice = scanner.nextLine();
                int num = Integer.valueOf(choice);
                InventoryItem item = itemList.get(num -1);

                System.out.println("Please enter the new number of " + item.item + "(s)" + " in your inventory.");
                String newItemAmount = scanner.nextLine();
                int amm = Integer.valueOf(newItemAmount);
                item.amount = amm;
                System.out.printf("%s. You now have [%s] %s's\n", (itemList.indexOf(item)+ 1), amm, item.item);
            }
            else if(option.equalsIgnoreCase("4")){
                for (InventoryItem item : itemList) {
                    System.out.printf("%s . [ %s ] %s(s) [%s]\n", (itemList.indexOf(item) +1), item.amount, item.item, item.category);
                }
            }
        }
    }
    public static InventoryItem createItem(String newItem, int newAmount, String newCategory) {

        switch (newCategory.toLowerCase()){
            case "1":
                return new Weapon(newItem, newAmount);
            case "2":
                return new Food(newItem, newAmount);
            case "3":
                return new ReadingMaterial(newItem, newAmount);
            case "4":
                return new Medicine(newItem, newAmount);
            case "5":
                return new Armor(newItem, newAmount);
            default:
                System.out.println("Please choose different number");
        }
        return null;
    }
}
