package homeworkConstructors;

/**
 * Created by mavdjiev on 5.6.2017 г..
 */
public class SilverMember extends MemberTypes {

    public double getMonthlyPayment(){
        double payment = monthlyRegPayment - (monthlyRegPayment/10);
        return payment;
    }
}
