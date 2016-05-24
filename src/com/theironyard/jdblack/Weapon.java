package com.theironyard.jdblack;

/**
 * Created by jonathandavidblack on 5/24/16.
 */
public class Weapon extends InventoryItem {

    public Weapon(String item, int amount, String category) {
        this.item = item;
        this.amount = amount;
        this.category = category;
    }
}
