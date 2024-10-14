import java.util.Scanner;
public class SayHello {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String name = myObj.nextLine();
        System.out.println("Hello, "+ name);
    }
}
