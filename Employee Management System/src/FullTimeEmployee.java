class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Full-Time Employee: " + name + ", Salary: $" + baseSalary);
    }
}