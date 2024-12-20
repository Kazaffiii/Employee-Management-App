public class EmployeeBuilder {
    private final String id;
    private final String name;
    private String department;
    private double salary;

    public EmployeeBuilder(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public EmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public EmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    
}