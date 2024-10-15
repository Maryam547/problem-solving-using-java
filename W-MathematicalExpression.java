import java.util.Scanner;

public class MathematicalExpression {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        int s = myObj.next().charAt(0);
        int b = myObj.nextInt();
        int q = myObj.next().charAt(0);
        int c = myObj.nextInt();
        switch(s){
            case '+':
                if((a+b)==c){
                    System.out.println("Yes");
                }else{
                    System.out.println(a+b);
                }
                break;
            case '-':
                if((a-b)==c){
                    System.out.println("Yes");
                }else{
                    System.out.println(a-b);
                }
                break;
            case '*':
                if((a*b)==c){
                    System.out.println("Yes");
                }else{
                    System.out.println(a*b);
                }
                break;
            
        }
    }
}

