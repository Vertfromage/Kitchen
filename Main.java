package com.crystal;

public class Main {

    public static void main(String[] args) {
	Kitchen mykitchen = new Kitchen(new Fridge(), new Stove(),new Sink(),new KitchenTable());
	mykitchen.AmITooTall(12);
	mykitchen.MakeSupper("Lamb Chops and Lemon Potatoes!");
	mykitchen.Cleanup();
	mykitchen.getFridge().GoShopping();
	mykitchen.MakeSupper("Lamb Chops and Lemon Potatoes!");
    }
}
