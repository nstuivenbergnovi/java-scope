package nl.novi.javaprogrammeren.two;

import java.util.Random;

public class MainTwo {
    public static void main(String[] args) {

        int totalsum = 0;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            // hier stond: int totalsum = 0; Die is verplaatst naar boven
            // hier stond: Random random = new Random();
            totalsum = totalsum + random.nextInt();
        }
        System.out.println("De som van alle random-getallen is: " + totalsum);

    }
}
