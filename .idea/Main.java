import com.sun.org.apache.xerces.internal.impl.XMLScanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance;
        System.out.println("What is the distance for our pets? (metres)");
        Scanner scanner = new Scanner(System.in);
        distance = scanner.nextInt();


        Pet[] pets = {new Dog(), new Cat()};


        for (int i = 0; i < pets.length; i++) {
            pets[i].run(distance);
            pets[i].swim(distance);
        }
    }
}
