package homeworkConstructors;


/**
 * Created by mavdjiev on 5.6.2017 г..
 */
public class ClubManagement {
    MemberTypes[] members = new MemberTypes[4];
    public double sumOfAllPayments(){
            for(int i = 0; i < members.length; i++){
                members[0] = new RegularMember();
                members[1] = new SilverMember();
                members[2] = new GoldMember();
                members[3] = new PlatinumMember();
            }
            double regMemb = members[0].getMonthlyPayment();
            double silMemb = members[1].getMonthlyPayment();
            double goldMemb = members[2].getMonthlyPayment();
            double platMemb = members[3].getMonthlyPayment();

            double sum = regMemb + silMemb + goldMemb + platMemb;
            return sum;
    }

    public static void main(String[] args) {
        ClubManagement manager = new ClubManagement();

        System.out.println(manager.sumOfAllPayments());

    }

}
