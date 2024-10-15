import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        int x = 0,y = 0,z = 0,num = 0;
        if(a>999&&a<=9999){
            x = a/1000;
        }
        if(x%2==0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
    }
}

//4 5 6 9
