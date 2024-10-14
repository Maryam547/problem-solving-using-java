import java.util.Scanner;
public class Difference {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long a = myObj.nextLong();
        long b = myObj.nextLong();
        long c = myObj.nextLong();
        long d = myObj.nextLong();
        long result = (a*b)-(c*d);
        System.out.println("Difference = "+result);
    }
}
