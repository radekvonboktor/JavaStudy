package headFirstJava;

/**
 * Created by mavdjiev on 16.5.2017 г..
 */
public class Dog {
    int size;
    String breed;
    String name;

    void bark(){
        if(size>60){
            System.out.println("Dog goes WOOOF WOOOF!!!");
        } else if(size >14){
            System.out.println("Dog goes RUFF RUFF!!!");
        } else {
            System.out.println("YIP YIP");
        }
    }
}
