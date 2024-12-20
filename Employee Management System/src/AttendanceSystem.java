
import java.util.ArrayList;
import java.util.List;

public class AttendanceSystem {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String eventType, String employeeName) {
        for (Observer observer : observers) {
            observer.update(eventType, employeeName);
        }
    }

    public void markAttendance(String employeeName) {
        System.out.println(employeeName + " marked present.");
        notifyObservers("AttendanceUpdated", employeeName);
    }
}
