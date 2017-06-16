package homeworkConstructors.vendingMachine;

/**
 * Created by Mars on 6/5/2017.
 */
public class Chips extends ItemLogic {
    public final double PRICE = 1.99;
    public final String NAME = "Chips";
    public final String CODE = "B2";

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

