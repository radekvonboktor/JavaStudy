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

    @Override
    public boolean checkPrice(double priceInput) {
        if (price <= priceInput) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkCode(String codeInput) {
        if(code.contains(codeInput)){
            return true;
        } else {
            return false;
        }
    }

}
