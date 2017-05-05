package homework;

/**
 * Write a Java program using arrays where you have the following output on the screen
 *  - - - - - - - - - -
 * - - - - - - - - - -
 * - - - - - - - - - -
 * - - - - - - - - - -
 * - - - - - - - - - -
 * - - - - - - - - - -
 * - - - - - - - - - -
 * - - - - - - - - - -
 * - - - - - - - - - -
 * - - - - - - - - - -
 */
public class Ex4 {
    public static void main(String[] args) {
        String[] arr = {" -"," -"," -"," -"," -"," -"," -"," -"," -"," -",};
        int y = 0;
        while(y < arr.length){
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i]);
            }
            y++;
            System.out.println();
        }
    }
}
