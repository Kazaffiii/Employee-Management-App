class HRDepartment extends Department {
    public HRDepartment() {
        this.departmentName = "Human Resources";
    }

    @Override
    public void showDepartment() {
        System.out.println("Department: " + departmentName);
    }
}