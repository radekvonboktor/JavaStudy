package homeworkConstructors.memberCode;


/**
 * Created by mavdjiev on 5.6.2017 г..
 */
public class ClubManagement {

    private static double sumOfAllPayments(MemberTypes[] members){
        double sum = 0;
        for(int i = 0; i < members.length; i++){
                sum += members[i].getMonthlyPayment();
        }
        return sum;
    }

    public static void main(String[] args) {
        ClubManagement manager = new ClubManagement();
        MemberTypes[] members = new MemberTypes[4];
        members[0] = new RegularMember();
        members[1] = new SilverMember();
        members[2] = new GoldMember();
        members[3] = new PlatinumMember();

        System.out.println(manager.sumOfAllPayments(members));
    }

}
