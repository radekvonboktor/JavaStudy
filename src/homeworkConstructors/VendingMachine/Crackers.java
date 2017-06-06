package homeworkConstructors.VendingMachine;

/**
 * Created by Mars on 6/5/2017.
 */
public class Crackers extends ItemsLogic {
    public final double price = 2.49;
    public final String name = "Crackers";
    public final String code = "C3";

    public String getName() {
        return code + " - " + name;
    }



}
