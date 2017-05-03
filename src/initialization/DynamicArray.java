package initialization;

/**
 * Created by mavdjiev on 27.4.2017 г..
 */
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[] {"fiddle", "de", "dum"});
    }
}

class Other{
    public static void main(String[] args) {
        for(String s : args){
            System.out.println(s + " ");
        }
    }
}
