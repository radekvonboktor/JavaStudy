package homeworkConstructors.vendingMachine;

/**
 * Created by Mars on 6/5/2017.
 */
public interface Item {

    boolean checkPrice(double priceInput);
    boolean checkCode(String nameInput);

}
