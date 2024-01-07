import java.util.Scanner;

class IceCream {
    String flavour = "Vanilla";
    double price = 10.0;
    Topping topping;

    IceCream(Topping topping) {
        this.topping = topping;
    }

    void getDescription() {
        System.out.println(flavour + " Ice cream with " + topping.getName());
        System.out.println("Total price" + (topping.getPrice() + price));

    }

}

interface Topping {
    String getName();

    double getPrice();

}

class Peanut implements Topping {
    String name = "Peanut";
    double price = 12.0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

}

class DarkChocolate implements Topping {
    String name = "Dark Chocolate";
    double price = 15.0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

}

public class IceCreamShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selectedTopping;
        System.out.println("Please select the topping number");
        System.out.println(
                "1. Peanut \n"
                        + "2. Dark Chocolate \n");

        selectedTopping = sc.nextInt();
        sc.close();

        Topping topping;
        IceCream iceCream;

        switch (selectedTopping) {
            case 1:

                topping = new Peanut();

                iceCream = new IceCream(topping);
                iceCream.getDescription();

                break;
            case 2:

                topping = new DarkChocolate();

                iceCream = new IceCream(topping);
                iceCream.getDescription();

                break;

            default:
                System.out.println("You didn't select anything");
                break;
        }

    }
}