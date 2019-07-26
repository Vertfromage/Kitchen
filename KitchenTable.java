package com.crystal;

public class KitchenTable {

    private boolean tableClean;
    private boolean foodOnTable;

    public KitchenTable() {
        this.tableClean = true;
        this.foodOnTable = false;
    }

    public void ClearTable() {
        if (this.tableClean){
            System.out.println("Wow, thanks for cleaning up!");
        }else{
            this.tableClean = true;
            this.foodOnTable = false;
            System.out.println("All I ever do is clean up after you people!");
        }


    }

    public void ServeFood(String whatAreWeServing) {
        this.SetTable();
        this.tableClean = false;
        this.foodOnTable = true;
        System.out.println("Dig in kids it's: "+ whatAreWeServing);
        System.out.println("Thank you Lord for this food!");
    }

    private void SetTable() {
        if(foodOnTable){
            System.out.println("The table is still dirty!");
            this.ClearTable();
        }
    }
}
