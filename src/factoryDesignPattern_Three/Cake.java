package factoryDesignPattern_Three;

/**
 * Created by mavdjiev on 12.6.2017 г..
 */
public abstract class Cake {

    String name;
    String type;
    int price;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void recipe();
    public abstract void myFans();

    public void aboutCake(){
        System.out.println("I am " + name + " Cake");
        System.out.println("My fans: ");
        myFans();
        System.out.println("You can get a " + name + " Cake at " + price);
    }

}
