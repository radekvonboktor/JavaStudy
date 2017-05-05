package homework;

import java.util.Scanner;

/**
 * Write a Java program that takes a single character from the alphabet. Print on screen “Vowel” or “Consonant”,
 * depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1,
 * print an error message.
 */
public class Ex8 {
    public static void main(String[] args) {
        boolean found = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("Chose a single character from the alphabet: ");
        String letter = reader.nextLine();
        String vowels = "aAeEoOiIuU";
        String consonant = "bBcCdDfFgGhHjJkKlmMnNpPqQrRsStTvVwWxXyYzZ";
        if(vowels.contains(letter)){
            System.out.println("Vowel");
        } else if(letter.length() > 1){
            System.out.println("TYPE JUST ONE LETTER YOU MORON, READ THE TASK");
        } else if(consonant.contains(letter)){
            System.out.println("Consonant");
        } else {
            System.out.println("WRONG DATA TYPE... why are you doing this?");
        }
    }
}
