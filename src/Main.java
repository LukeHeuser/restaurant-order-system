public class Main {
    public static void main(String[] args) {

        // Test cases . . .
//        MealOrder firstOrder = new MealOrder();
//        firstOrder.addBurgerToppings("lettuce","CHEESE","AVOCADO");
//        firstOrder.setDrinkSize("MEDIUM");
//        firstOrder.printItemizedList();
//
//        Burger cheeseBurger = new Burger("Cheese Burger", 3.50);
//        cheeseBurger.addToppings("Cheese", "Ham", "Avocado");
//        cheeseBurger.printItem();
//
//        MealOrder secondOrder = new MealOrder("Swiss Burger", "Onion Rings",
//                "Mountain Dew");
//        secondOrder.addBurgerToppings("lettuce","Mayo","AVOCADO");
//        secondOrder.setDrinkSize("Large");
//        secondOrder.printItemizedList();


        // The method below calls a Deluxe Burger combo with a price that includes the burger, the Side,
        // as well as the drink. We could add functionality to change the price depending on the Meal size. (COMPLETED)
        // Only a Large drink size increases the cost by the set amount of a large Drink.
        MealOrder thirdOrder = new MealOrder("Deluxe", "Fries", "Sprite");
        thirdOrder.addBurgerToppings("Cheese", "Lettuce", "Bacon", "Mayo", "Tomato");
        thirdOrder.setDrinkSize("Medium");
        thirdOrder.printItemizedList();


        MealOrder jennsOrder = new MealOrder("Double Cheese Burger", "Fries", "Coke");
        jennsOrder.addBurgerToppings("Lettuce", "Mayo", "Tomato");
        jennsOrder.setDrinkSize("Large");
        jennsOrder.printItemizedList();


    }

}
