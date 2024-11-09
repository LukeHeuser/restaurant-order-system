public class Main {
    public static void main(String[] args) {

//        MealOrder firstOrder = new MealOrder();
//        firstOrder.addBurgerToppings("lettuce","CHEESE","AVOCADO");
//        firstOrder.setDrinkSize("MEDIUM");
//        firstOrder.printItemizedList();

        Burger cheeseBurger = new Burger("Cheese Burger", 3.50);
        cheeseBurger.addToppings("Cheese", "Ham", "Avocado");
        cheeseBurger.printItem();


        MealOrder secondOrder = new MealOrder("Swiss Burger", "Onion Rings",
                "Mountain Dew");
        secondOrder.addBurgerToppings("lettuce","Mayo","AVOCADO");
        secondOrder.setDrinkSize("Medium");
        secondOrder.printItemizedList();


    }

}
