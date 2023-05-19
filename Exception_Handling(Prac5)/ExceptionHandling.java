import java.util.*;

public class ExceptionHandling {

    static void checkPass(String password) throws PasswordException {
        int c = 0;
        if (password.length() < 8) {
            throw new PasswordException(password);
        }
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                c++;
                break;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                c++;
                break;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                c++;
                break;
            }
        }
        if (c == 3) {
            System.out.println("password ok!");
        } else {
            throw new PasswordException(password);
        }
    }

    static void checkCGPA(float cg) throws CGPAException {
        if (cg < 0 || cg > 10) {
            throw new CGPAException(cg);
        } else {
            System.out.println("cgpa ok!");
        }
    }

    static void checkEnroll(String enrollment) throws EnrollNumException {
        int c = 0;
        String s = enrollment.substring(3, 6);
        System.out.println(s);
        if (s == "CSU" || s == "ECU" || s == "ENU" || s == "EEU") {
            c++;
        } else {
            throw new EnrollNumException(enrollment);
        }
        String s1 = enrollment.substring(7, 9);
        System.out.println(s1);
        if (Integer.parseInt(s1) > 0 && Integer.parseInt(s1) < 251) {
            c++;
        } else {
            throw new EnrollNumException(enrollment);
        }
        if (c == 2) {
            System.out.println("enrollment ok!");
        }
    }

    public static void main(String[] args) {
        String name, pass, enroll;
        float cgpa;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter password: ");
        pass = sc.nextLine();
        try {
            checkPass(pass);
        } catch (PasswordException err) {
            System.out.println(err);
        }
        System.out.println("Enter CGPA: ");
        cgpa = sc.nextFloat();
        try {
            checkCGPA(cgpa);
        } catch (CGPAException err) {
            System.out.println(err);
        }
        System.out.println("Enter Enrollment: ");
        enroll = sc.next();
        try {
            checkEnroll(enroll);
        } catch (EnrollNumException err) {
            System.out.println(err);
        }
        Student obj = new Student(name, pass, enroll,cgpa);
    }

}