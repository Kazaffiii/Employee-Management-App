public class PayrollSystem {
    private static PayrollSystem instance;

    private PayrollSystem() {
        // Private constructor to prevent instantiation
    }

    public static PayrollSystem getInstance() {
        if (instance == null) {
            instance = new PayrollSystem();
        }
        return instance;
    }

    public void processPayroll() {
        System.out.println("Payroll processing is centralized and consistent.");
    }
}
