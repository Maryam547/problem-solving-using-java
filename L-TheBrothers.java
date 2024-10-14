import java.util.Scanner;

public class TheBrothers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String f1 = myObj.next();
        String s1 = myObj.next();
        String f2 = myObj.next();
        String s2 = myObj.next();
        if(s1.equals(s2))
            System.out.println("ARE Brothers");
        else
            System.out.println("NOT");
    }
}
