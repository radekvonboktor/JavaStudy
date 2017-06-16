package factoryDesignPattern_Two;

/**
 * Created by mavdjiev on 12.6.2017 г..
 */
public class IPhone implements Mobile {
    private int ramSize;
    private String processor;
    private String GPU;

    public IPhone(int ramSize, String processor, String GPU){
        this.ramSize = ramSize;
        this.processor = processor;
        this.GPU = GPU;
    }

}
