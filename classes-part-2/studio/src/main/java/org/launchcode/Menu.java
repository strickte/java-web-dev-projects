package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems;

    // Constructor
    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.lastUpdated = new Date();
    }
    //last week's constructor
    public Menu() {
        this.menuItems = new ArrayList<>();
        this.lastUpdated = new Date();
    }




    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return menuItems;
    }

    // add a menu item
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
        this.lastUpdated = new Date();
    }

    public void removeMenuItem(MenuItem item) {
        menuItems.remove(item);
        this.lastUpdated = new Date();
    }

    public void displayMenu() {
        for (MenuItem item : menuItems) {
            System.out.println("Category: " + item.getCategory());
            System.out.println("Name: " + item.getName());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Price: $" + item.getPrice());
            System.out.println();
        }
        System.out.println("Menu last updated: " + lastUpdated);
    }

    public void displayMenuItem(MenuItem item) {
        System.out.println("Category: " + item.getCategory());
        System.out.println("Name: " + item.getName());
        System.out.println("Description: " + item.getDescription());
        System.out.println("Price: $" + item.getPrice());
        System.out.println();
    }



}


