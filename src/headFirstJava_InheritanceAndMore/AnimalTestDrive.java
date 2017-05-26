package headFirstJava_InheritanceAndMore;

/**
 * Created by mavdjiev on 22.5.2017 г..
 */
public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog d = new Dog();
        Cat c = new Cat();
        list.add(d);
        list.add(c);
        if(d.equals(c)){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
}
