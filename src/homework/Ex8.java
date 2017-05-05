package homework;

import java.util.Scanner;

/**
 * Write a Java program that takes a single character from the alphabet. Print on screen “Vowel” or “Consonant”,
 * depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1,
 * print an error message.
 */
public class Ex8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Chose a single character from the alphabet: ");
        char letter = reader.next().charAt(0);
        if(letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E'
                || letter == 'o' || letter == 'O' || letter == 'i' || letter == 'I'
                || letter == 'u' || letter == 'U'){
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }


    }
}
