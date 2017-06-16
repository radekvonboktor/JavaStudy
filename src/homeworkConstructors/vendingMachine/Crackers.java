package homeworkConstructors.vendingMachine;

/**
 * Created by Mars on 6/5/2017.
 */
public class Crackers extends ItemLogic {
    public final double PRICE = 2.49;
    public final String NAME = "Crackers";
    public final String CODE = "C3";

    public String getName() {
        return CODE + " - " + NAME;
    }

    @Override
    public boolean checkPrice(double priceInput) {
        return PRICE <= priceInput;
    }

    @Override
    public boolean checkCode(String codeInput) {
        return CODE.contains(codeInput);
    }

}
