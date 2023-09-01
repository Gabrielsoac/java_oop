package employee_system;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;
    private double liquidSalary;


    public Employee(String name, double grossSalary, double tax){ //Constructor with parameters
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
        this.liquidSalary = grossSalary - tax;
    }
    public double getLiquidSalary(){
        liquidSalary = grossSalary - tax;
        System.out.printf("Liquid Salary = %.2f", liquidSalary);
        return liquidSalary;
    }
    public void increaseSalary(double percentage){
        grossSalary += grossSalary * (percentage / 100);
        System.out.printf("\nGross Salary update as: %.2f\n", grossSalary);
    }
    public String toString(){
        return "\nEmployee \nName: " + String.format("%s", name)
                + "\nGross Salary: " + String.format("%.2f", grossSalary)
                + "\nTax Salary: " + String.format("%.2f", tax);
    }
}