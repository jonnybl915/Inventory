package com.theironyard.jdblack;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by jonathandavidblack on 5/23/16.
 */
public class InventoryItem {
    String item;
    int amount;
    String category;

    public InventoryItem() {
    }

    public InventoryItem(String item, int amount, String category) {
        this.item = item;
        this.amount = amount;
        this.category = category;


    }
}
