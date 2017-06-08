package homeworkConstructors.MemberCode;

/**
 * Created by mavdjiev on 5.6.2017 г..
 */
public abstract class MemberTypes implements Member {

    final double monthlyRegPayment = 30.0;
    final double silverMonthlyRegPayment = monthlyRegPayment -(monthlyRegPayment/10);
    final double goldMonthlyRegPayment = monthlyRegPayment - (monthlyRegPayment/5);
    final double platMonthlyRegPayment = monthlyRegPayment - (3* monthlyRegPayment/10);
}
