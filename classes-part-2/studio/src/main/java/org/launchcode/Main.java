package org.launchcode;

public class Main {

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Caesar Salad",8.00, "romaine lettuce with Caesar dressing", "Appetizer");
        MenuItem item2 = new MenuItem("Chocolate cake", 5.00, "chocolate cake with strawberries and hot fudge", "Dessert");
        MenuItem item3 = new MenuItem("Spaghetti", 12.00, "classic homemade pasta with tomato sauce", "Entree");

        Menu menu = new Menu();

        menu.addMenuItem(item1);
        menu.addMenuItem(item2);
        menu.addMenuItem(item3);

        System.out.println("Full Current Menu:");
        menu.displayMenu();
        menu.removeMenuItem(item1);
        menu.displayMenu();
        menu.addMenuItem(item1);
        menu.displayMenu();
    }
    //We're AMAZING!!
    //TOnight was so much fun!!
}
