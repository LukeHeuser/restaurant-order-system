public class MealOrder {

    private Burger burger;
    private Item side;
    private Item drink;

    public MealOrder() {
        this("REGULAR", "FRIES","SPRITE");
    }

    public MealOrder(String burgerType, String sideType, String drinkType) {

        if(burgerType.equalsIgnoreCase("DELUXE")) {
            this.burger = new DeluxeBurger(burgerType, 8.00d);
        } else {
            this.burger = new Burger(burgerType, 3.50d);
        }
        this.side = new Item("side",sideType, 1.50d);
        this.drink = new Item("DRINK", drinkType, 1.00d);
    }

    public double getTotalPrice() {

        if(burger instanceof DeluxeBurger) {
            return drink.getSize().equalsIgnoreCase("Large") ? burger.getAdjustedPrice() :
                    burger.getAdjustedPrice() + drink.getAdjustedPrice();
        }
        // This code below was refactored by the ternary operator above. It is easier to read and understand!

//      if(burger instanceof DeluxeBurger) {
//          if (drink.getSize().equalsIgnoreCase("Large")){
//              return burger.getAdjustedPrice() + drink.getAdjustedPrice();
//          }
//          return burger.getAdjustedPrice();

        // The below statement is returned if a normal meal is ordered that not a Deluxe Burger.
        return burger.getAdjustedPrice() + side.getAdjustedPrice() +
                drink.getAdjustedPrice();
    }


    public void printItemizedList() {

        if(burger instanceof DeluxeBurger) {
            burger.printItem();
            side.printItem(side.getName(),0);
            if (drink.getSize().equalsIgnoreCase("LARGE")) {
                drink.printItem(drink.getName(),drink.getAdjustedPrice());
            } else {
                drink.printItem(drink.getName(),0);
            }
        } else {
            burger.printItem();
            side.printItem();
            drink.printItem();
        }
        System.out.println("-".repeat(25));
        Item.printItem("TOTAL PRICE",getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1,extra2,extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3,
                                  String extra4, String extra5) {

        if(burger instanceof DeluxeBurger deluxeBurger) {
            deluxeBurger.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addToppings(extra1,extra2,extra3);
        }

    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

}



