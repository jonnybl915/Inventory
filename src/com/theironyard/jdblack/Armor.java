package com.theironyard.jdblack;

/**
 * Created by jonathandavidblack on 5/24/16.
 */
public class Armor extends InventoryItem {

    public Armor(String item, int amount){
        this.item = item;
        this.amount = amount;
        this.category = "Armor";
    }
}
