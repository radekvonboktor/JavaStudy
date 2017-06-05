package homeworkConstructors;

/**
 * Created by mavdjiev on 5.6.2017 г..
 */
public class MemberTypes implements Member {
    public MemberTypes() {
        double monthlyRegPayment = 30.0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}
