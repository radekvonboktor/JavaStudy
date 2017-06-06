package homeworkConstructors.VendingMachine;

/**
 * Created by Mars on 6/5/2017.
 */
public class Cola extends ItemsLogic {
    public final double price = 1.59;
    public final String name = "A1 - Cola";

    public String getName() {
        return this.name;
    }

    @Override
    public boolean checkPrice(double priceInput) {
        if(price <= priceInput){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkName(String nameInput) {
        if(name.contains(nameInput)){
            return true;
        } else {
            return false;
        }
    }

}
