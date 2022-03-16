package com.example.helloworld;
import java.util.concurrent.ThreadLocalRandom;
//Time Complexity O(n) = O(max-min).
//Space Complexity 0(1)

public class HelloWorld {
    public static void main(String[] args) {
        printInRange(1,10);
    }
    public static int randomInRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    public static void printInRange(int min, int max) {
        if (min > max) {
            return;
        }

        int current = randomInRange (min, max);
        System.out.print(current + ", ");
        printInRange(min, current-1);
        printInRange(current+1, max);
    }

}
