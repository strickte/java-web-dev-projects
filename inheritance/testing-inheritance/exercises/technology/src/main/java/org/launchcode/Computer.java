package org.launchcode;

public class Computer extends AbstractEntity{
    private boolean hasScreen = true;
    private boolean hasKeyboard = true;
    private boolean goesBeepBoop = false;
    private String brand;

    public Computer(String brand) {
        this.brand = brand;
    }

    public void setHasScreen(boolean hasScreen) {
        this.hasScreen = hasScreen;
    }

    public boolean isHasScreen() {
        return hasScreen;
    }

    public void setHasKeyboard(boolean hasKeyboard) {
        this.hasKeyboard = hasKeyboard;
    }

    public boolean isHasKeyboard() {
        return hasKeyboard;
    }

    public void setGoesBeepBoop(boolean goesBeepBoop) {
        this.goesBeepBoop = goesBeepBoop;
    }

    public boolean isGoesBeepBoop() {
        return goesBeepBoop;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void makeComputations() {
        goesBeepBoop = true;
    }

    public String makeNoise() {
        if(goesBeepBoop) {
            return "Beep-boop";
        } else {
            return "....";
        }
    }
}
