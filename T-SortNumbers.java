import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        int c = myObj.nextInt();
        int min1 = 0,min2 = 0,min3 = 0;
        if(a<=c&&a<=b){
            min1 = a;
            if(b<=c){
                min2 = b;
                min3 = c;
            }else{
                min2 = c;
                min3 = b;
            }
            System.out.println(min1);
            System.out.println(min2);
            System.out.println(min3);
        }
        else if(b<=c&&b<=a){
            min1 = b;
            if(a<=c){
                min2 = a;
                min3 = c;
            }else{
                min2 = c;
                min3 = a;
            }
            System.out.println(min1);
            System.out.println(min2);
            System.out.println(min3);
        }
        else if(c<=a&&c<=b){
            min1 = c;
            if(b<=a){
                min2 = b;
                min3 = a;
            }else{
                min2 = a;
                min3 = b;
            }
            System.out.println(min1);
            System.out.println(min2);
            System.out.println(min3);
        }
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

