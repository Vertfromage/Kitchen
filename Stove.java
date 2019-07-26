package com.crystal;

public class Stove {

    private boolean stoveBroken;

    public Stove() {
        this.stoveBroken = false;
    }

    public String CookFood(boolean foodInFridge, String whatWillWeEat) {
        if (foodInFridge&& this.stoveBroken!=true){
            System.out.println("Hang on there I'm cooking!");
            return whatWillWeEat;
        }else{
            System.out.println("There's no food in the fridge guess I'm ordering pizza for supper tonight!");
            return "It's pizza!";
        }
    }
}
