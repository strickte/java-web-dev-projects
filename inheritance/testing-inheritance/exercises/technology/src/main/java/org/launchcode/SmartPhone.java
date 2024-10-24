package org.launchcode;

public class SmartPhone extends Computer{
    private boolean onSilent;

    public SmartPhone(boolean onSilent, String brand) {
        super(brand);
        this.onSilent = onSilent;
    }

    public void setOnSilent(boolean onSilent) {
        this.onSilent = onSilent;
    }
    public boolean isGetOnSilent() {
        return onSilent;
    }

    public void switchSilentMode() {
        onSilent = !onSilent;
    }
}
