public class Placement extends College {
    String indus_name;
    int annual_package;
    int joining_letter;

    Placement(String name, String gender, String dept, float cgpa, String indus_name, int annual_package,
            int joining_letter) {
        super(name, gender, dept, cgpa);
        this.indus_name = indus_name;
        this.annual_package = annual_package;
        this.joining_letter = joining_letter;
    }

    public void display() {
        super.display();
        System.out.println("Industry Name: " + indus_name);
        System.out.println("Annual annual_package: " + annual_package);
        System.out.println("Joining letter Number:  " + joining_letter);
    }
}