import java.util.Scanner;
 
public class LastTwoDigits {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        int c = myObj.nextInt();
        int d = myObj.nextInt();
        
        // Calculate result modulo 100 at each multiplication step
        long result = (a % 100) * (b % 100) % 100;
        result = (result * (c % 100)) % 100;
        result = (result * (d % 100)) % 100;
        
        // Print the result, making sure the output is formatted as two digits
        System.out.printf("%02d\n", result);
    }
}
