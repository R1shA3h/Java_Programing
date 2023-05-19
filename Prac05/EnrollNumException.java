public class EnrollNumException extends Exception {
    String en;

    EnrollNumException(String s) {
        en = s;
    }

    public String toString() {
        return "Enrollment number wrong\n";
    }
}