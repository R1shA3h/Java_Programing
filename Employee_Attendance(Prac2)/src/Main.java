import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee emp[] = new Employee[3];
        // Person 1
        emp[0] = new Employee("Rishabh", 1943, 19, 5000000, "HR Manager");
        emp[0].add_attendence();
        emp[0].display();
    }
}