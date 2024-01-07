import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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

        Computer comp = new Laptop();

        comp.compiler();

        // summafunction();
        Scanner sc = new Scanner(System.in);

        String input;
        System.out.println("Enter the string to get first non repeated char: ");
        input = sc.nextLine();
        sc.close();
        System.out.println(firstNonRepeatedChar(input));

    }

    public static void summaFunction() {
        Set<Character> charSet = new HashSet<>();
        charSet.add('c');

        for (Character intSet : charSet) {
            System.out.println(intSet);

        }

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(8);
        nums.add(15);

        // Collections.sort(nums);
        nums.sort(null);

        for (Integer n : nums) {
            System.out.println(n);

        }

    }

    static char firstNonRepeatedChar(String str) {
        Map<Character, Integer> charSet = new HashMap<>();

        for (char letter : str.toLowerCase().toCharArray()) {
            charSet.put(letter, charSet.getOrDefault(letter, 0) + 1);

        }
        for (char c : str.toLowerCase().toCharArray()) {
            if (charSet.get(c) == 1) {
                return c;

            }
        }

        return '\0';

    }

}

class Keyboard {
    int keys;
    String color;

    void print() {
        System.out.println("Print in key : ");

    }

}