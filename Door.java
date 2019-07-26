package com.crystal;

public class Door {
    private String color = "unpainted";

    public void paintDoor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
