package headFirstJava;

/**
 * Created by mavdjiev on 16.5.2017 г..
 */
public class MovieTestDriver {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Gone with the stock";
        one.genre = "tragic";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Lost in the cubicle space";
        two.genre = "comedy";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title ="Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
    }
}
