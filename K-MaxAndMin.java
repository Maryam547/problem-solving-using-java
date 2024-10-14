import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        int c = myObj.nextInt();
        int max = 0;
        int min = 0;
        if(a>=b&&a>=c){
            max=a;
            if(b<=c){
                min = b;
            }
            else{
                min = c;
            }
        }
        else if(b>=a&&b>=c){
            max=b;
            if(a<=c){
                min = a;
            }
            else{
                min = c;
            }
        }
        else if(c>=a&&c>=b){
            max=c;
            if(a<=b){
                min = a;
            }
            else{
                min = b;
            }
        }
        System.out.println(min+" "+max);
    }
}
