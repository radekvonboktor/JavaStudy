package homeworkCollections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mavdjiev on 14.6.2017 г..
 */
public class Ex1_Map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "uno");
        map.put(2, "dos");
        map.put(3, "tres");
        map.put(4, "maria");
        map.put(5, "https://www.youtube.com/watch?v=AHCPGCIu7O4");

        System.out.println("Print all on 1 line: " + map);
        System.out.println("Print 1: " + map.get(1));
        System.out.println("Print 2: " + map.get(2));
        System.out.println("Print 3: " + map.get(3));
        System.out.println("Print 4: " + map.get(4));
        System.out.println("Print 5: " + map.get(5));

        System.out.println();
        System.out.println("Print all keys and values with 2 lines");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

