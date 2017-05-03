package initialization;

/**
 * Created by mavdjiev on 27.4.2017 г..
 */
public class EnumOrder {
    public static void main(String[] args) {
        for(Spiciness s : Spiciness.values()){
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}
