package com.crystal;

public class Kitchen extends Room {
    private Fridge fridge;
    private Stove stove;
    private Sink sink;
    private KitchenTable table;

    public Kitchen(Fridge fridge, Stove stove, Sink sink, KitchenTable table) {
        super(12, 9, 15, 2, 3);
        this.fridge = fridge;
        this.stove = stove;
        this.sink = sink;
        this.table = table;
    }

    public Fridge getFridge() {
        return fridge;
    }

    public void MakeSupper(String whatWillWeEat){
        System.out.println("Let's make: "+whatWillWeEat);
        table.ServeFood(stove.CookFood(fridge.GetFood(), whatWillWeEat));
    }

    public void Cleanup(){
        table.ClearTable();
        sink.WashDishes();
    }

}
