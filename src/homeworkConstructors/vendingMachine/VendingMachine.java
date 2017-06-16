package homeworkConstructors.vendingMachine;

/**
 * Created by Mars on 6/5/2017.
 */
public class VendingMachine {
    public static void main(String[] args) {
        System.out.println("Please put money in the money tray:");
        ItemLogic iL = new ItemLogic();
        iL.startTheMachine();
        iL.performChecks();

    }
}
