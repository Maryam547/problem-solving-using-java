import java.util.Scanner;

public class HardCompare {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        // Use long to handle large input numbers
        long a = myObj.nextLong();
        long b = myObj.nextLong();
        long c = myObj.nextLong();
        long d = myObj.nextLong();
        
        // Compare using logarithms to avoid overflow
        double logA = b * Math.log(a);
        double logC = d * Math.log(c);
        
        if (logA > logC) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
