import java.util.Scanner;

public class Comprasion {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        int s = myObj.next().charAt(0);
        int b = myObj.nextInt();
        if(s=='<'){
            if(a<b){
                System.out.println("Right");
            }else{
                System.out.println("Wrong");
            }
        }else if(s=='>'){
            if(a>b){
                System.out.println("Right");
            }else{
                System.out.println("Wrong");
            }
        }else if(s=='='){
            if(a==b){
                System.out.println("Right");
            }else{
                System.out.println("Wrong");
            }
        }
    }
}

