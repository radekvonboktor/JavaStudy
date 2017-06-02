package superClassConstructors;

/**
 * Created by mavdjiev on 31.5.2017 г..
 */
public class TestBox {
    Integer i = 1;
    int j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go(){
        i++;
        j=i;
        System.out.println(j);
        System.out.println(i);
    }
}
