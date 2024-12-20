class FullTimePayroll implements PayrollStrategy {
    @Override
    public double calculatePay(double basePay, int hoursWorked) {
        return basePay;
    }
}