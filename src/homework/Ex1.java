package homework;

/**
 * Write a Java program that defines an array with integer numbers. The program should print the sum of all array elements
 */
public class Ex1 {
    public static void main(String[] args) {
            int[] arr = {13,34,12,54,11,74,10,94};
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                sum = sum + arr[i];
            }
        System.out.println("The sum is: " + sum);

    }
}
