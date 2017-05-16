package objectOrientedP.inheritance;

/**
 * Created by mavdjiev on 15.5.2017 г..
 */

class SuperClass1{
    int age;
    SuperClass1(int age){
        this.age = age;
    }
    public void getAge() {
        System.out.println("The value of the variable named age in super class is: " + age);
    }
}

public class Subclass1 extends SuperClass1 {
    Subclass1(int age){
        super(age);
    }

    public static void main(String[] args) {
        Subclass1 s = new Subclass1(25);
        s.getAge();
    }
}
