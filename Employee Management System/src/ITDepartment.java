class ITDepartment extends Department {
    public ITDepartment() {
        this.departmentName = "Information Technology";
    }

    @Override
    public void showDepartment() {
        System.out.println("Department: " + departmentName);
    }
}