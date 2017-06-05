package homeworkConstructors.MemberCode;


/**
 * Created by mavdjiev on 5.6.2017 г..
 */
public class ClubManagement {
    MemberTypes[] members = new MemberTypes[4];

    public double sumOfAllPayments(){
        double sum = 0;

        members[0] = new RegularMember();
        members[1] = new SilverMember();
        members[2] = new GoldMember();
        members[3] = new PlatinumMember();

        for(int i = 0; i < members.length; i++){
                sum += members[i].getMonthlyPayment();
        }
        return sum;
    }

    public static void main(String[] args) {
        ClubManagement manager = new ClubManagement();
        System.out.println(manager.sumOfAllPayments());
    }

}
