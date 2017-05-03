package Homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a Java program to find the maximum and minimum value of an array.
 */
public class ex2 {
    public static void main(String[] args) {
        //Initializing an array of 5(can be more) values
        int[] arr = new  int[5];
        //Initializing the scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter 5 random values: ");
        //Storing the user entered data in the array
        for(int i = 0; i < 5; i++){
            arr[i] = reader.nextInt();
        }
        //Sorting the data in the arrays
        Arrays.sort(arr);
        System.out.println("Min value: " + arr[0]);
        System.out.println("Max value: " + arr[arr.length - 1]);




    }
}
