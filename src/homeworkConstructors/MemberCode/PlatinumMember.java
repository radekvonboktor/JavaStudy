package homeworkConstructors.MemberCode;

/**
 * Created by mavdjiev on 5.6.2017 г..
 */
public class PlatinumMember extends MemberTypes {

    public double getMonthlyPayment(){
        double payment = monthlyRegPayment - (3* monthlyRegPayment/10);
        return payment;
    }
}
