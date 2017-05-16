package objectOrientedP.inheritance;

/**
 * Created by mavdjiev on 15.5.2017 г..
 */
class Calculation{
    int z;

    public void addition(int x, int y){
        z = x + y;
        System.out.println("The sum is: " + z);
    }
    public void subtraction(int x, int y){
        z = x - y;
        System.out.println("The substr is: " + z);
    }
}
public class MyCalculation extends Calculation {
    public void multipl(int x, int y){
        z = x * y;
        System.out.println("The multipl is: " + z);
    }

    public static void main(String[] args) {
        int a = 20, b = 10;
        MyCalculation demo = new MyCalculation();
        demo.addition(a, b);
        demo.subtraction(a, b);
        demo.multipl(a, b);
    }
}
