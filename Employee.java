import java.util.Scanner;


public class Employee{

   
    int empId;
    String empName;
    double[] monthlySalary;
 
    
    public Employee(int empId, String empName, double[] monthlySalary) {
        this.empId = empId;
        this.empName = empName;
        this.monthlySalary = monthlySalary;
    }

   
    public double calculateTotalSalary() {
        double total = 0;
        for (double salary : monthlySalary) {
            total += salary;
        }
        return total;
    }

    
    public double calculateAverageSalary() {
        return calculateTotalSalary() / monthlySalary.length;
    }

    
    public int countVowels() {
        int count = 0;
        String lowerName = empName.toLowerCase();
        for (int i = 0; i < lowerName.length(); i++) {
            char ch = lowerName.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

   
    public String reverseName() {
        String reversed = "";
        for (int i = empName.length() - 1; i >= 0; i--) {
            reversed += empName.charAt(i);
        }
        return reversed;
    }

  
    public void displayDetails() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Total Salary  : " + (int) calculateTotalSalary());
        System.out.println("Average Salary: " + (int) calculateAverageSalary());
        System.out.println("Number of Vowels : " + countVowels());
        System.out.println("Reversed Name : " + reverseName());
    }

    
    public static void main(String[] args) {
        double[] salaries = {25000, 30000, 35000};
        Employee emp = new Employee(101, "Karthik", salaries);
        emp.displayDetails();
    }
}