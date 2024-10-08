package org.launchcode;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public Menu(List<MenuItem> menuItems, LocalDate lastUpdated) {
        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addMenuItems(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

}

