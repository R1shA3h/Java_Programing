import java.util.*;
public class Entreprenuership extends College {
    String comp_name;
    String sector;
    int no_of_employees;
    int annual_turnover;

    Entreprenuership(String name, String gender, String dept, float cgpa, String comp_name, String sector,
            int no_of_employees, int annual_turnover) {
        super(name, gender, dept, cgpa);
        this.comp_name = comp_name;
        this.sector = sector;
        this.no_of_employees = no_of_employees;
        this.annual_turnover = annual_turnover;
    }

    public void display() {
        super.display();
        System.out.println("Company Name: " + comp_name);
        System.out.println("Sector: " + sector);
        System.out.println("Number of Employees: " + no_of_employees);
        System.out.println("Annual turnover: " + annual_turnover);
    }

}
