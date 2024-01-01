abstract class Computer {
    public abstract void compiler();

}

class Desktop extends Computer {

    public void compiler() {
        System.out.println("Compiling form Desktop");

    }

}

class Laptop extends Computer {

    public void compiler() {
        System.out.println("Compiling form laptop");
    }

}

class Dev {

    // Laptop laptop = new Laptop();

    public void coding(Computer comp) {
        System.out.println("Coding by develper using : :" + comp.toString());
    }
}

public class Demo {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(num);

        Computer laptop = new Laptop();

        Dev dev = new Dev();
        dev.coding(laptop);

    }

}