package Object;

/**
 * Created by mavdjiev on 21.4.2017 г..
 */

public class ShowProperties {

    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
