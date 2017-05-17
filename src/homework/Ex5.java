package homework;

import java.util.Scanner;

/**
 * Write a program that shows on the screen if a number is prime or not
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a random number: ");
        int rand = reader.nextInt();
        for(int i = 2; i <= rand; i++){
            if(rand % i != 0 || rand ==2){
                System.out.println("The number you entered is prime");
                break;
            } else {
                System.out.println("The number you entered is NOT PRIME YOU DUMBFUCK");
                break;
        }
        }
    }
}
