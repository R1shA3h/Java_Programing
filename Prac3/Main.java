import java.util.*;

public class Main {
    public static void main(String[] args) {
        College college1[] = new College[5];
        System.out.println(
                "\n**************************************Students Info********************************************");
        college1[0] = new College("Sujot", "M", "CSE", 10);
        college1[0].display();
        System.out.println(
                "\n**************************************Placement Info********************************************");
        college1[1] = new Placement("Rishabh Jain", "M", "CSE", 9, "TCS", 1900000, 19875);
        college1[1].display();
        System.out.println(
                "\n**************************************HigherStudies Info********************************************");
        college1[2] = new Higherstudies("Sahil Khune", "M", "CSE(AIML)", 9, "M.Tech", "NIT", 175, 98);
        college1[2].display();
        System.out.println(
                "\n**************************************Entreprenuer Info********************************************");
        college1[3] = new Entreprenuership("Shreyash Sahu", "M", "CSE(DS)", 8, "Google", "Software Developer", 50,
                100000);
        college1[3].display();
    }
}
