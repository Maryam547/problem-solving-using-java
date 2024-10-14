import java.util.Scanner;
 
public class TwoIntervals {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        long l1 = myObj.nextLong();
        long r1 = myObj.nextLong();
        long l2 = myObj.nextLong();
        long r2 = myObj.nextLong();
        
        
        if (l1 > r2 || l2 > r1) {
           
            System.out.println(-1);
        } else {
            
            long start = Math.max(l1, l2);
            long end = Math.min(r1, r2);
            System.out.println(start + " " + end);
        }
    }
}

import java.util.Scanner;
 
public class TwoIntervals {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        long l1 = myObj.nextLong();
        long r1 = myObj.nextLong();
        long l2 = myObj.nextLong();
        long r2 = myObj.nextLong();
        
        
        if (Math.min(r1, r2) < Math.max(l1, l2)) {
            System.out.println(-1); // No overlap
        } else {
           
            long start = Math.max(l1, l2);
            long end = Math.min(r1, r2);
            System.out.println(start + " " + end);
        }
    }
}
