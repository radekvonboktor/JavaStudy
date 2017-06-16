package homeworkConstructors.vendingMachine;

/**
 * Created by Mars on 6/5/2017.
 */
public class Cola extends ItemLogic {

    public final double PRICE = 1.59;
    public final String NAME = "Cola";
    public final String CODE = "A1";

    public String getName() {
        return CODE + " - " +  NAME;
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
