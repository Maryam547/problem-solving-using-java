import java.util.Scanner;

public class CapitalOrSmallOrDigit {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        char a = myObj.next().charAt(0);
        int ch = (int)a;
        if(ch>=97&&ch<=122){
            System.out.println("ALPHA");
            System.out.println("IS SMALL");
        }else if(ch>=65&&ch<=90){
            System.out.println("ALPHA");
            System.out.println("IS CAPITAL");
        }else{
            System.out.println("IS DIGIT");
        }
            
    }
}
