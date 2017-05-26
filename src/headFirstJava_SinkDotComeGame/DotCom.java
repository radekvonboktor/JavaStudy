package headFirstJava_SinkDotComeGame;

import java.util.ArrayList;

/**
 * Created by mavdjiev on 18.5.2017 г..
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setName(String n) {
        this.name = n;
    }

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    public String checkYourself(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);

        if(index >= 0){
            locationCells.remove(index);

            if(locationCells.isEmpty()){
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " :( ");
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
