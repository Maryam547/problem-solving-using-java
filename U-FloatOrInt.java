import java.util.Scanner;

public class FloatOrInt {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double n = myObj.nextDouble();
        int x = (int)n;
        double fraction = n-x;
        if(fraction==0){
            System.out.println("int "+x);
        }else{
            System.out.println("float "+x+" "+Math.round(fraction*1000.0)/1000.0);
        }
    }
}

