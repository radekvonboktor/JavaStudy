package homework;

/**
 * Write a Java program that prints pattern like shown in the picture
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Ex9 {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            for(int y = 1; y <= i; y++){
                System.out.print(y);
            }
            System.out.println();
        }

    }
}
