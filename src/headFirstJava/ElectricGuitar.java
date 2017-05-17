package headFirstJava;

/**
 * Created by mavdjiev on 17.5.2017 г..
 */
public class ElectricGuitar{
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    String getBrand(){
        return brand;
    }
    void setBrand(String aBrand){
        brand = aBrand;
    }

    int getNumOfPickups() {
        return numOfPickups;
    }
    void setNumOfPickups(int num){
        numOfPickups = num;
    }
    boolean getRockStarUsesIt(){
        return rockStarUsesIt;
    }
    void setRockStarUsesIt(boolean yesOrNo){
        rockStarUsesIt = yesOrNo;
    }


}
