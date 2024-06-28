public class DevOpsEngineer extends Employee1 {
    private double bonus;

    public DevOpsEngineer(String name, String empId, double salary, double bonus) {
        super(name, empId, salary);
        this.bonus = bonus;
    }

    public void displayDevOpsEngineerDetails() {
        displayEmployeeDetails();
        double totalSalary = getSalary() + bonus;
        System.out.println("Employee Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void main(String[] args) {
        DevOpsEngineer devOpsEngineer = new DevOpsEngineer("Jane Doe", "E67890", 85000.0, 5000.0);
        devOpsEngineer.displayDevOpsEngineerDetails();
    }
}
