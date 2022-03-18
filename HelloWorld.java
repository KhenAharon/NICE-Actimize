package com.example.helloworld;
import java.util.concurrent.ThreadLocalRandom;


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("first way: ");
        //Time Complexity O(n) = O(max-min), Space Complexity 0(1)
        printInRange(11,20);
        System.out.println("\nsecond way:");
        // Time Complexity O(n) = O(max-min), space complexity O(n) = O(max-min)
        printInRange2(11,20);
    }
    public static int randomInRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    //Time Complexity O(n) = O(max-min), Space Complexity 0(1)
    public static void printInRange(int min, int max) {
        if (min > max) {
            return;
        }

        int current = randomInRange (min, max);
        System.out.print(current + ", ");
        printInRange(min, current-1);
        printInRange(current+1, max);
    }
    // Time Complexity O(n) = O(max-min), space complexity O(n) = O(max-min)
    public static void printInRange2(int min, int max){
        int arr[] = new int[max - min + 1] ;
        int curMin = min;
        int randNum, tmp;
        for (int i = 0; i < arr.length; i++){
            arr[i] = curMin++;
        }
        for (int i = 0; i < arr.length; i++){
            randNum = randomInRange(min, max);
            tmp = arr[arr.length - 1];
            arr[arr.length - 1] = arr[randNum - min];
            arr[randNum - min] = tmp;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
