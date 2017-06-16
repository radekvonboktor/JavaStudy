package serializableIO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by mavdjiev on 16.6.2017 г..
 */
public class Pond implements Serializable {

    private Duck duck = new Duck();

    public static void main(String[] args) {

        Pond myPond = new Pond();

        try{
            FileOutputStream fs = new FileOutputStream("Pond.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(myPond);
            os.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

 class Duck{

}