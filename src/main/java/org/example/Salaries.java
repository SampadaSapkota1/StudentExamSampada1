import java.util.ArrayList;

public class Salaries{
    public static void main(String[] args) {
        ArrayList<Integer> salaries = new ArrayList<>();
        salaries.add(4500);
        salaries.add(52000);
        salaries.add(47000);
        salaries.add(600);
        salaries.add(54000);

        double totalSalary = 0;
        for (Integer salary : salaries) {
            totalSalary += salary;
        }

        double averageSalary = totalSalary / salaries.size();

        if (averageSalary < 50000) {
            System.out.println("The average salary is: " + averageSalary);
            System.out.println("This is considered: Low Salary");
        } else if (averageSalary >= 50000 && averageSalary <= 60000) {
            System.out.println("The average salary is: " + averageSalary);
            System.out.println("This is the average salary oof employee: Average Salary");
        } else {
            System.out.println("The average salary is: " + averageSalary);
            System.out.println("This is highest salary of employee: High Salary");
        }
    }
}
