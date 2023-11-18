public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.initialize1("Özbilenler", "62863");
        staff.print1();
        staff.salaryToPay(40, 20.0);
        staff.salaryForOvertime(5, 30.0);


        boolean bonusEligible = Salary.shouldReceiveBonus(6);
        System.out.println("Bonus Eligibility: " + bonusEligible + " Özbilenler 62863");
    }
}