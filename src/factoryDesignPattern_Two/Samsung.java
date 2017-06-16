package factoryDesignPattern_Two;

/**
 * Created by mavdjiev on 12.6.2017 г..
 */
public class Samsung implements Mobile {
    private int ramSize;
    private String processor;

    public Samsung(int ramSize){
        this.ramSize = ramSize;
    }

    public Samsung(String processor){
        this.processor = processor;
        this.ramSize = 2;
    }
}
