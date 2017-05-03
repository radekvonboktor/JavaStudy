package homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a Java program to find the maximum and minimum value of an array.
 */
public class Ex2 {
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
        //Creating another array so that we can use it for another way to do the task
        int[] arr2 = arr;
        //Sorting the data in the arrays using Arrays.sort()
        Arrays.sort(arr2);
        System.out.println("Using Arrays.sort()");
        System.out.println("Min value: " + arr2[0]);
        System.out.println("Max value: " + arr2[arr2.length - 1]);

        //Using the created methods in order to complete the task
        System.out.println("Using custom methods to complete the task");
        System.out.println("Min value: " + getMinValue(arr));
        System.out.println("Max value: " + getMaxValue(arr));
    }

    //Creating getMaxValue and getMinValue methods
    public static int getMaxValue(int[] arr){
        int maxValue = arr[0];
        for(int i = 0; i < 5; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[] arr){
        int minValue = arr[0];
        for(int i = 0; i < 5; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
