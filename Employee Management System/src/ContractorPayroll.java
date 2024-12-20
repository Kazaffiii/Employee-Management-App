class ContractorPayroll implements PayrollStrategy {
    @Override
    public double calculatePay(double basePay, int hoursWorked) {
        return basePay * hoursWorked * 1.1; // Extra for contractors
    }
}