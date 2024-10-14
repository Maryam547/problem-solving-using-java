import java.util.Scanner;

public class SummationFromOneToOne {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long n = myObj.nextLong();
        long res = (n*(n+1))/2;
        System.out.println(res);
    }
}
