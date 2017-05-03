package homework;

/**
 * Write a Java program, where you have two String arrays and prints all the common elements. For example:
 * If array1 contains value “abc”, “cde”, “efg” and array2 contains values “ffff”, “abv”, “abc”, the output of the program should be only “abc”
 */
public class Ex3 {
    public static void main(String[] args) {
        String[] arr1 = {"abc", "cde", "efg"};
        String[] arr2 = {"ffff", "abv", "abc"};

        for(int i = 0; i < 3; i++){
            for(int y = 0; y < 3; y++){
                if(arr1[i] == arr2[y]){
                    System.out.println(arr2[y]);
                }
            }
        }
    }
}
