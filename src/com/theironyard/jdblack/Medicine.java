package com.theironyard.jdblack;

/**
 * Created by jonathandavidblack on 5/24/16.
 */
public class Medicine extends InventoryItem {

    public Medicine(String item, int amount, String category){
        this.item = item;
        this.amount = amount;
        this.category = category;
    }
}
