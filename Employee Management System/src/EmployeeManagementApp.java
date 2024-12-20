import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EmployeeManagementApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button addEmployeeButton = new Button("Add Employee");
        Button processPayrollButton = new Button("Process Payroll");

        addEmployeeButton.setOnAction(e -> System.out.println("Add Employee Clicked"));
        processPayrollButton.setOnAction(e -> PayrollSystem.getInstance().processPayroll());

        VBox root = new VBox(10, addEmployeeButton, processPayrollButton);

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setTitle("Employee Management System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}