import java.util.Scanner;

public class WelcomeForYourCondition {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        if(a>=b)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
