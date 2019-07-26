package com.crystal;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int width;
    private int height;
    private int length;
    private int doors;
    private int windows;
    private int area = 0;

    List<Door> doorList = new ArrayList<Door>();
    List<aWindow> windowList = new ArrayList<aWindow>();

    public Room(int width, int height, int length, int numDoors, int numWindows) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.doors = numDoors;
        this.windows = numWindows;

        this.BuildRoom();
    }

    private void BuildRoom(){
        for (int i = this.doors; i >0; i--) {
            doorList.add(new Door());
        }

        for (int i = this.windows; i >0; i--) {
            windowList.add(new aWindow(false));
        }

        this.area = this.width*this.length;

        System.out.println("This room is built it is "+ this.area+" sqft and it has "+this.doors+" doors and "+ this.windows+" windows");
    }

    public void AmITooTall(int yourHeight){
        if (yourHeight>this.height){
            System.out.println("You are a freak of nature, get out of my house!");
        }else{
            System.out.println("Welcome to my humble home!");
        }
    }
}
