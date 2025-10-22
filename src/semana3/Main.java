package semana3;

public class Main {
    public static void main(String[] args) {
        rh employee = new rh();
        employee.setName("John Doe");
        employee.setSalary(50000);
        employee.setRole("Software Engineer");

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());
        System.out.println("Employee Role: " + employee.getRole());
    }
}
