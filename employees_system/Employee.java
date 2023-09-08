package employee_system;

public class Employee {
    private Integer id;
    private String name;
    private Double grossSalary;
    private Double tax;


    public Employee(String name, Double grossSalary, Double tax){ //Constructor with parameters
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax / 100;
    }
    public Employee(Integer id, String name, Double grosssalary){
        this.id = id;
        this. name = name;
        this.grossSalary = grosssalary;
    }
    public Employee(){ //Constructor without parameters
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getGrossSalary() {
        return grossSalary;
    }
    public Double getTax() {
        return tax;
    }
    public void setTax(Double tax) {
        this.tax = tax / 100;
    }
    public double getLiquidSalary(){
        return grossSalary - (grossSalary * tax);
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