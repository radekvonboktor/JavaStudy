package homeworkCollections;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mavdjiev on 14.6.2017 г..
 */
public class Ex2_List {
    public static void main(String[] args) {
        List<Circle> circList = new ArrayList<>();

        while(randomWithRange(0, 1) > 0.01){
            circList.add(new Circle(randomWithRange(0, 1)));
        }
        for(Circle c : circList){
            if(!circList.isEmpty()){
                System.out.println("The #" + (circList.indexOf(c) + 1) + " recorded radius is: " + c.radius);
            } else {
                System.out.println("Nothing was recorded");
                break;
            }

        }

    }

    static double randomWithRange(double min, double max){
        double range = (max - min);
        double rand = (Math.random() * range) + min;
        return rand;
    }

}
