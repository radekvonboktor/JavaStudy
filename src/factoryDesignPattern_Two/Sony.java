package factoryDesignPattern_Two;

/**
 * Created by mavdjiev on 12.6.2017 г..
 */
public class Sony implements Mobile {
    private int ramSize;
    private String processor;

    public Sony(int ramSize, String processor){
        this.ramSize = ramSize;
        this.processor = processor;
    }

}
