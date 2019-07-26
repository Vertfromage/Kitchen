package com.crystal;

public class Sink {
    private boolean dishesDirty;

    public Sink() {
        this.dishesDirty = false;
    }

    public void WashDishes() {
        if (dishesDirty){
            System.out.println("hawh! I hate doing dishes.");
            System.out.println("Scrub,scrub, scrub.");
            this.dishesDirty = false;
        }else{
            System.out.println("My goodness! Someone did the dishes already!");
        }
    }
}
