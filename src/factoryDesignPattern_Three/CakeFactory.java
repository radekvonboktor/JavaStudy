package factoryDesignPattern_Three;

/**
 * Created by mavdjiev on 12.6.2017 г..
 */
public class CakeFactory implements Factory {

    public Cake createCake(String cakeName){

        Cake cake = null;

        if(cakeName.equals("Black Forest")){
            cake = new BlackForest();
        } else if (cakeName.equals("Blue Berry")){
            cake = new BlueBerry();
        } else if (cakeName.equals("Litchi Gateaux")){
            cake = new LitchiGateaux();
        } else if (cakeName.equals("Pineapple")){
            cake = new Pineapple();
        }

        return cake;
    }
}
