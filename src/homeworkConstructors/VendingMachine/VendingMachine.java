package homeworkConstructors.VendingMachine;

import java.util.Scanner;

/**
 * Created by Mars on 6/5/2017.
 */
public class VendingMachine {
    public static void main(String[] args) {
        System.out.println("Please put money in the money tray:");
        ItemsLogic iL = new ItemsLogic();
        iL.startTheMachine();
        iL.performChecks();

    }
}
