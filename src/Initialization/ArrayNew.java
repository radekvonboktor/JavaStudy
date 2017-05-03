package Initialization;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by mavdjiev on 27.4.2017 г..
 */
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
