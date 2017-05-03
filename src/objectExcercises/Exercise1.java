package objectExcercises;

/**
 *  Create a class containing an int and a char that are not initialized, and
 *  print their values to verify that Java performs default initialization.
 */
public class Exercise1 {
        int i;
        char c;
        public Exercise1(){
            System.out.println("i = " + i);
            System.out.println("c = [" + c + ']');
        }

    public static void main(String[] args) {
        new Exercise1();

    }
}
