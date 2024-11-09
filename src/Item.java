public class Item {

    private String type;
    private String name;
    private double price;
    private String size = "SMALL";

    public Item(String type, String name, double price) {
            this.name = name.toUpperCase();
            this.type = type.toUpperCase();
            this.price = price;
    }
    public Item(String name, String type, double price, String size) {
        this(name,type,price);
        this.size = size.toUpperCase();
    }

    public double getBasePrice() {
         return price;
    }

    public double getAdjustedPrice() {

        if(type.equals("DRINK")) {
            return switch (size.charAt(0)) {
                case 'M' -> getBasePrice() + 0.75d;
                case 'L' -> getBasePrice() + 1.00d;
                default -> getBasePrice();
            };
        } else if (type.equals("SIDE")) {
            return switch (size.charAt(0)) {
                case 'M' -> getBasePrice() + 1.00d;
                case 'L' -> getBasePrice() + 1.50d;
                default -> getBasePrice();
            };
        }
        return getBasePrice();
    }

    public String getName() {

        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }

        return name;

    }

    public void setSize(String size) {
        this.size = size.toUpperCase();
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n",name, price);
    }

    public void printItem() {
        printItem(getName(),getAdjustedPrice());
    }

}
