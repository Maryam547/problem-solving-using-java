import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        int y=0,m=0,d=0;
        for(;x>=365;){
            y++;
            x=x-365;
        }
        for(;x>=30;){
            m++;
            x=x-30;
        }
        for(int i=0;x>=1;x--){
            d++;
        }
        System.out.println(y+" years");
        System.out.println(m+" months");
        System.out.println(d+" days");
    }
}

