package Homework;

import java.util.Random;
import java.util.Scanner;

/**
 * Write a Java program to find the maximum and minimum value of an array.
 */
public class ex2 {
    public static void main(String[] args) {
        int[] arr = new  int[5];
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter 5 random values: ");
        for(int i = 0; i < 5; i++){
            arr[i] = reader.nextInt();
        }

    }
}
