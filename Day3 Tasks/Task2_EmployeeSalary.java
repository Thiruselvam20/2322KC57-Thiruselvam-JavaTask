public class Task2_EmployeeSalary {
    private String name;
    private int age;
    private double basicSalary;

    public Task2_EmployeeSalary(String name, int age, double basicSalary) {
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        double hra = 0.2 * basicSalary;
        double da = 0.1 * basicSalary;
        return basicSalary + hra + da;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Total Salary: " + calculateSalary());
    }

    public static void main(String[] args) {
        Task2_EmployeeSalary emp = new Task2_EmployeeSalary("John", 30, 30000);
        emp.displayDetails();
    }
}
