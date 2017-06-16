package factoryDesignPattern_Two;

/**
 * Created by mavdjiev on 12.6.2017 г..
 */
public class Exec {
    public static void main(String[] args) {
        Mobile mobile = MobileFactory.createMobile(Mobile.SAMSUNG);
        System.out.println(mobile);
    }
}
