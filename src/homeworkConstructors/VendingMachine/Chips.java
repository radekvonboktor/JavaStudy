package homeworkConstructors.VendingMachine;

/**
 * Created by Mars on 6/5/2017.
 */
public class Chips extends ItemsLogic {
    public final double price = 1.99;
    public final String name = "A2 - Chips";


    public String getName() {
        return this.name;
    }

    @Override
    public boolean checkPrice(double priceInput) {
        if(this.price <= priceInput){
            System.out.println("You ordered " + this.getClass().getName() + ", here is it");
            return true;
        } else {
            System.out.println("Sorry, the amount is not enough for this purchase. Please add more money and try again");
            return false;
        }
    }

    @Override
    public boolean checkItem(String nameInput) {
        if(this.name.contains(nameInput)){
            System.out.println("Sorry, we don't have item with such a code");
            return false;
        } else {
            return true;
        }
    }
}
