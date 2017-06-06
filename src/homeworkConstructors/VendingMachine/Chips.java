package homeworkConstructors.VendingMachine;

/**
 * Created by Mars on 6/5/2017.
 */
public class Chips extends ItemsLogic {
    public final double price = 1.99;
    public final String name = "Chips";
    public final String code = "B2";

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
        if(code.equals(codeInput)){
            return true;
        } else {
            return false;
        }
    }
}

