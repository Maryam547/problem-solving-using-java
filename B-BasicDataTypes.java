import java.util.Scanner;
public class DataTypes {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int i = myObj.nextInt();
        long l = myObj.nextLong();
        char ch = myObj.next().charAt(0);  // Read the first character from input
        float f = myObj.nextFloat();
        double d = myObj.nextDouble();
        System.out.println(i);
        System.out.println(l);
        System.out.println(ch);
        System.out.printf("%.2f\n", f);
        System.out.printf("%.1f\n", d);
    }
}
