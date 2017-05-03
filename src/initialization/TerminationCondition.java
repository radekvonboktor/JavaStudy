package initialization;

/**
 * Created by mavdjiev on 26.4.2017 г..
 */
class Book{
    boolean checkedOut = false;
    Book(boolean checkOut){
        checkedOut = checkOut;
    }
    void checkIn(){
        checkedOut = false;
    }
    protected void finalize(){
        if(checkedOut){
            System.out.println("Error: checked out");
        }
    }
}
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Proper cleanup
        novel.checkIn();
        //Drop the reference, forgot to clean up
        new Book(true);
        //Force gc & finalization:
        System.gc();

    }
}
