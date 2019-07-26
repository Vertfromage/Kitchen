package com.crystal;

public class aWindow {

    private boolean windowOpen;

    public aWindow(boolean windowOpen) {
        this.windowOpen = windowOpen;
    }

    public boolean isWindowOpen() {
        return windowOpen;
    }

    public void OpenWindow(boolean windowOpen) {
        this.windowOpen = windowOpen;
    }
}
