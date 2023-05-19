import java.util.*;
public class Higherstudies extends College {
    String degree;
    String college_name;
    int adm_letter_no;
    float score;

    Higherstudies(String name, String gender, String dept, float cgpa, String degree, String college_name,
            int adm_letter_no, int score) {
        super(name, gender, dept, cgpa);
        this.degree = degree;
        this.college_name = college_name;
        this.adm_letter_no = adm_letter_no;
        this.score = score;
    }

    public void display() {
        super.display();
        System.out.println("Degree : " + degree);
        System.out.println("College Name: " + college_name);
        System.out.println("Admission Letter Number: " + adm_letter_no);
        System.out.println("Score: " + score);
    }
}