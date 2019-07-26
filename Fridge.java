package com.crystal;

public class Fridge {
    private boolean foodInFridge;

    public Fridge() {
        this.foodInFridge = false;
    }

    public boolean GetFood() {
        return this.foodInFridge;
    }

    public void GoShopping(){
        System.out.println("Okay going out for groceries!");
        this.foodInFridge = true;
    }
}
