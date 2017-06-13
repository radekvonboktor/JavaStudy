package homeworkConstructors.vendingMachine_Refactored;

/**
 * Created by mavdjiev on 12.6.2017 г..
 */
public class ItemFactory {

    public Item createItem(String inputCode) {
        Item item = null;

        if (inputCode.equals("A1")) {
            item = new Cola();
        } else if (inputCode.equals("B2")) {
            item = new Chips();
        } else if (inputCode.equals("C3")) {
            item = new Crackers();
        }
        return item;
    }

    public void displayOptions(){

        Item[] items = new Item[3];
        items[0] = new Cola();
        items[1] = new Chips();
        items[2] = new Crackers();
        System.out.println("Put the money in the tray and choose an item from the list below");
        for(int i = 0; i < items.length; i++){
            System.out.println(items[i].getName());
        }

    }
}


