package org.launchcode;

public class MenuItems {

        // write your code here
        private double price;
        private String description;
        private String category;
        private boolean isNew;

        public MenuItems(double price, String description, String category) {
            this.price = price;
            this.description = description;
            this.category = category;
            this.isNew = true;
        }

        public void setPrice(double price) {
            this.price = price;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public void setCategory(String category) {
            this.category = category;
        }
        public  void setIsNew(boolean isNew) {
            this.isNew = isNew;
        }

        public double getPrice() {
            return price;
        }
        public String getDescription() {
            return description;
        }
        public String getCategory() {
            return category;
        }
        public boolean getIsNew() {
            return isNew;
        }


        //public class Menu
        //  private field of ArrayList<MenuItem> menuItems
        //  private field for  String lastUpdated
        //  getter and setter for menuItems
        //  getter and setter for lastUpdated
        //      use Scanner input "Please enter today's date: " and save in private field;
        //
        //
        //  public class MenuItem
        //  private field price
        //  private field description
        //  private field category
        //  ?private field date added?
        //  getters and setters for price, description, category, ?date added?

}
