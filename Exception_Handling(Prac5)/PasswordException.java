public class PasswordException extends Exception {
    String en;

    PasswordException(String s) {
        en = s;
    }

    public String toString() {
        return "Password format wrong\n";
    }
}