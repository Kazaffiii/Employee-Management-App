class DepartmentFactory {
    public static Department createDepartment(String type) {
        switch (type) {
            case "HR" -> {
                return new HRDepartment();
            }
            case "IT" -> {
                return new ITDepartment();
            }
            default -> throw new IllegalArgumentException("Invalid department type.");
        }
    }
}