package org.launchcode;

public class Program {
    public static void main(String[] args) {
        Laptop macbook = new Laptop("Sara", "Apple");
        SmartPhone iPhone = new SmartPhone(false, "Apple");
        SmartPhone iPhoneX = new SmartPhone(true, "Apple");
        iPhone.switchSilentMode();
        iPhone.switchSilentMode();
        System.out.println(iPhone.isGetOnSilent());
        System.out.println(macbook.makeNoise());
        macbook.makeComputations();
        System.out.println(macbook.makeNoise());
        System.out.println(macbook.getNextId());
        System.out.println(iPhone.getNextId());
        System.out.println(iPhoneX.getNextId());
    }
}