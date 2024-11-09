public class MealOrder {

    private Burger burger;
    private Item side;
    private Item drink;

    public MealOrder() {
        this("REGULAR", "FRIES","SPRITE");
    }

    public MealOrder(String burgerType, String sideType, String drinkType) {
        this.burger = new Burger(burgerType, 3.50d);
        this.side = new Item(sideType, "SIDE", 1.50d);
        this.drink = new Item(drinkType, "DRINK", 1.00d);
    }

    public double getTotalPrice() {
        return burger.getAdjustedPrice() + side.getAdjustedPrice() +
                drink.getAdjustedPrice();
    }


    public void printItemizedList() {
        burger.printItem();
        side.printItem();
        drink.printItem();
        System.out.println("-".repeat(25));
        Item.printItem("TOTAL PRICE",getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1,extra2,extra3);
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

}



