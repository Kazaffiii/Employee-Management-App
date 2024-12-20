class EmployeeFactory {
    public static Employee createEmployee(String type, String name, double baseSalary) {
        switch (type) {
            case "FullTime" -> {
                return new FullTimeEmployee(name, baseSalary);
            }
            case "PartTime" -> {
                return new PartTimeEmployee(name, baseSalary);
            }
            case "Contractor" -> {
                return new Contractor(name, baseSalary);
            }
            default -> throw new IllegalArgumentException("Invalid employee type.");
        }
    }
}