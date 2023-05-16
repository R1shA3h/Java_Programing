public class College {
    String name;
    String gender;
    String dept;
    float cgpa;

    College(String name, String gender, String dept, float cgpa) {
        this.name = name;
        this.gender = gender;
        this.dept = dept;
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Department: " + dept);
        System.out.println("CGPA: " + cgpa);
    }
}