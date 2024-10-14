import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long x = myObj.nextLong();
        long y = myObj.nextLong();
        long add = x+y;
        long mul = x*y;
        long sub = x-y;
        System.out.println(x+" + "+y+" = "+add);
        System.out.println(x+" * "+y+" = "+mul);
        System.out.println(x+" - "+y+" = "+sub);
    }
}
