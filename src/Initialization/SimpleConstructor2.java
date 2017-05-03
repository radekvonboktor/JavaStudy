package Initialization;

/**
 * Created by mavdjiev on 26.4.2017 г..
 */
class Rock2{
    Rock2(int i) {
        System.out.println(i + "." + " Rock");
    }
}
public class SimpleConstructor2 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            new Rock2(i);
        }
    }
}
