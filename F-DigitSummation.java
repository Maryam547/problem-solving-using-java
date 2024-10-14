import java.util.Scanner;

public class DigitSummation {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long a = myObj.nextLong();
        long b = myObj.nextLong();
        System.out.println(a%10+b%10);
    }
}
