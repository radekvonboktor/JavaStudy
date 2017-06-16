package serializableIO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by mavdjiev on 16.6.2017 г..
 */
public class Box implements Serializable{

    private int width;
    private int height;

    public void setWidth(int w){
        width = w;
    }

    public void setHeight(int h){
        height = h;
    }

    public static void main(String[] args) {

        Box myBox = new Box();
        myBox.setHeight(20);
        myBox.setWidth(50);

        try{
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
