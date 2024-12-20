class Contractor extends Employee {
    public Contractor(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Contractor: " + name + ", Salary: $" + baseSalary);
    }
}