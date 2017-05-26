package headFirstJava_InheritanceAndMore;

/**
 * Created by mavdjiev on 22.5.2017 г..
 */
public class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a){
        if(nextIndex < animals.length){
            animals[nextIndex] = a;
            System.out.println("Animal was added at: " + nextIndex);
            nextIndex++;
        }
    }
}
