package homework;

import java.util.Scanner;

/**
 * Write a program that prints the day of the week by a given number, example
 * 1 is Monday, 2 is Tuesday….. And so on.
 */
public class Ex7 {
    public static void main(String[] args)  {
        String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number between 1 and 7");
        int number = reader.nextInt();
        System.out.println(number + " is " + day[number - 1]);
    }
}
