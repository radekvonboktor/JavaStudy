package factoryDesignPattern_Three;

/**
 * Created by mavdjiev on 12.6.2017 г..
 */
public class CakeStore {
        Factory factory;

        CakeStore(Factory factory){
            this.factory = factory;
        }

        public Cake newCakeOrder(String cakeName, String customerName){
            Cake cake;

            cake = factory.createCake(cakeName);

            cake.myFans();

            return cake;
        }
}
