import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int offest = 'a'-'A';
        char a = myObj.next().charAt(0);
        int ch = (int)a;
        if(ch>=97&&ch<=122){
            a-=offest;
            System.out.println(a);
        }else if(ch>=65&&ch<=90){
            a+=offest;
            System.out.println(a);
        }
            
    }
}
