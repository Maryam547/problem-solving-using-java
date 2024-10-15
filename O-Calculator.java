import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int a = myObj.nextInt();  // Read first number
        char s = myObj.next().charAt(0);  // Read the operator
        int b = myObj.nextInt();  // Read second number

        if (s == '+') {
            System.out.println(a + b);
        } else if (s == '-') {
            System.out.println(a - b);
        } else if (s == '*') {
            System.out.println(a * b);
        } else if (s == '/') {
            if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("Error: Division by zero");
            }
        }
    }
}
