package homework;

/**
 * Write a program that sums all numbers from 1 to 100
 * with for/while loop
 */
public class Ex6 {
    public static void main(String[] args) {
        
        //for loop
        int sum1 = 0;
        for(int i = 1; i <= 100; i++){
            sum1 += i;
        }
        System.out.println("The sum using FOR loop: "  + sum1);
        System.out.println("------------------------------");

        //while loop
        int sum2 = 0;
        int y = 1;
        while(y <= 100){
                sum2 += y;
                y++;
        }
        System.out.println("The sum using WHILE loop: "  + sum2);
    }
}
