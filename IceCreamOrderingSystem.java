// Interface for Ice Cream
interface IceCream {
    String getDescription();

    double getPrice();
}

// Base class for Ice Cream flavors
class IceCreamFlavor implements IceCream {
    private final String description;
    private final double price;

    IceCreamFlavor(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}

// Interface for Toppings
interface Topping extends IceCream {
    IceCream addTopping(IceCream iceCream);
}

// Concrete Topping classes implementing Topping interface
class PeanutTopping implements Topping {
    private final String description = "Peanut";
    private final double price = 1.0;

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public IceCream addTopping(IceCream iceCream) {
        return new IceCreamWithTopping(iceCream, this);
    }
}

class WhippedCreamTopping implements Topping {
    private final String description = "Whipped Cream";
    private final double price = 0.75;

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public IceCream addTopping(IceCream iceCream) {
        return new IceCreamWithTopping(iceCream, this);
    }
}

// Concrete decorator class to add toppings to ice cream
class IceCreamWithTopping implements IceCream {
    private final IceCream iceCream;
    private final Topping topping;

    IceCreamWithTopping(IceCream iceCream, Topping topping) {
        this.iceCream = iceCream;
        this.topping = topping;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", " + topping.getDescription();
    }

    public double getPrice() {
        return iceCream.getPrice() + topping.getPrice();
    }
}

public class IceCreamOrderingSystem {
    public static void main(String[] args) {
        // Creating base ice cream flavor
        IceCream vanillaIceCream = new IceCreamFlavor("Vanilla", 2.5);

        // Adding toppings dynamically using Factory Method
        Topping peanutTopping = new PeanutTopping();
        Topping whippedCreamTopping = new WhippedCreamTopping();

        IceCream iceCreamWithPeanut = peanutTopping.addTopping(vanillaIceCream);
        IceCream iceCreamWithWhippedCream = whippedCreamTopping.addTopping(vanillaIceCream);

        // Customer orders
        System.out.println("Ice Cream with Peanut: " + iceCreamWithPeanut.getDescription());
        System.out.println("Price: $" + iceCreamWithPeanut.getPrice());

        System.out.println("\nIce Cream with Whipped Cream: " + iceCreamWithWhippedCream.getDescription());
        System.out.println("Price: $" + iceCreamWithWhippedCream.getPrice());
    }
}
