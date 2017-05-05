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
        String letter = reader.nextLine();
        String[] vowels = {"a", "e", "i", "o", "u", "y"};
        for(int i = 0; i < vowels.length; i++){
            if(letter.equals(vowels[i])){
                System.out.println("Vowel");
                break;
        }else if(letter != vowels[i]){
                System.out.println("Consonant");
                break;
            } else if(letter.length() >1){
                System.out.println("You entered more than one characters");
            }


        }

    }
}
