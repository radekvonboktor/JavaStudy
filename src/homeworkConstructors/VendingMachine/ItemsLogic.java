package homeworkConstructors.VendingMachine;

/**
 * Created by Mars on 6/5/2017.
 */
public class ItemsLogic implements Items {
    public double price;
    public String name;
    public String code;
    public static ItemsLogic[] items = new ItemsLogic[3];

    protected ItemsLogic(){
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
