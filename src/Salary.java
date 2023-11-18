import java.util.Scanner;

interface Salary {
    void salaryToPay(int hours, double rate);

    default void salaryForOvertime(int overtimeHours, double overtimeRate) {
        double overtimeSalary = overtimeHours * overtimeRate;
        System.out.println("Overtime Salary: " + overtimeSalary + " Özbilenler 62863");
    }

    static boolean shouldReceiveBonus(int yearsOfExperience) {
        return yearsOfExperience >= 5;
    }
}