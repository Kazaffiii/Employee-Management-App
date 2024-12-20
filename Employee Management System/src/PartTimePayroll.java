class PartTimePayroll implements PayrollStrategy {
    @Override
    public double calculatePay(double basePay, int hoursWorked) {
        return basePay * hoursWorked;
    }
}