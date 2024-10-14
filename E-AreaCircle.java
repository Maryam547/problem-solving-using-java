import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double r = myObj.nextDouble();
        double pi = 3.141592653;
        double area = pi*r*r;
        System.out.println(area);
    }
}
