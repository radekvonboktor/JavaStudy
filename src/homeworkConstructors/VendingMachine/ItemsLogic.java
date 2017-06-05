package homeworkConstructors.VendingMachine;

/**
 * Created by Mars on 6/5/2017.
 */
public abstract class ItemsLogic implements Items {
    public double price;
    public String name;

    public String getName(){
        return name;
    }
}
