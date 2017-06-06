package homeworkConstructors.VendingMachine;

import java.util.Scanner;

/**
 * Created by Mars on 6/5/2017.
 */
public class VendingMachine {

    public void startTheMachine(){
        ItemsLogic[] items = new ItemsLogic[3];
        items[0] = new Cola();
        items[1] = new Chips();
        items[2] = new Crackers();

        for(int i = 0; i < items.length; i++){
            System.out.println(items[i].getName());
        }
    }

    public void initializeItems(){
        ItemsLogic[] items = new ItemsLogic[3];
        items[0] = new Cola();
        items[1] = new Chips();
        items[2] = new Crackers();
    }

    public void performChecks(){
        initializeItems();

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please put money in the money tray:");
        VendingMachine vm = new VendingMachine();
        vm.startTheMachine();
        String nameInput = reader.nextLine();


    }
}
