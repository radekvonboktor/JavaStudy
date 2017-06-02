package superClassConstructors;

/**
 * Created by mavdjiev on 30.5.2017 г..
 */
public abstract class Animal {
    private String name;

    public String getName(){
        return name;
    }

    public Animal(String theName){
        name = theName;
    }
}
