class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Part-Time Employee: " + name + ", Salary: $" + baseSalary);
    }
}