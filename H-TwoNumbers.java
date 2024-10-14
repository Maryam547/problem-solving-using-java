import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        double res = (double)a/b;
        System.out.println("floor "+a+" / "+b+" = "+(int)Math.floor(res));
        System.out.println("ceil "+a+" / "+b+" = "+(int)Math.ceil(res));
        System.out.println("round "+a+" / "+b+" = "+Math.round(res));
    }
}
