package semana3;

public class rh {
    public String name;
    private double salary;
    protected String role;

    // Getter y Setter para name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getRole() {
        return role;
    }

    // Setter con validación
    public void setRole(String role) {
        if (role != null && !role.isEmpty()) {
            this.role = role;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }
}
