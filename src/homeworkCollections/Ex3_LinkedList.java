package homeworkCollections;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mavdjiev on 14.6.2017 г..
 */
public class Ex3_LinkedList {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("pink");
        colors.add("yellow");
        colors.add("black");
        colors.add("gray");
        colors.add("purple");

        System.out.println("--------------");
        System.out.println("All colors");
        for(String s : colors){
            System.out.println(s);
        }

        System.out.println("--------------");
        System.out.println("New colors");
        colors.set(1, "red");
        for(String s : colors){
            System.out.println(s);
        }
    }


}
