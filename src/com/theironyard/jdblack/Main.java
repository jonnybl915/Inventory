package com.theironyard.jdblack;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<InventoryItem> itemList = new ArrayList<>();
    String option;
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
            break;
        }
    }
    public void newItem(Scanner scanner, ArrayList<InventoryItem> item) {
        int numInt = 3;
        option = scanner.nextLine();
        numInt = Integer.valueOf(option);
        if(numInt ==1) {
            System.out.println("Please type new Item Name");
            option = scanner.nextLine();

        }
    }
}
