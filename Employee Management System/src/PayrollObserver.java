class PayrollObserver implements Observer {
    @Override
    public void update(String eventType, String employeeName) {
        System.out.println("Payroll System: Updating salary for " + employeeName);
    }
}