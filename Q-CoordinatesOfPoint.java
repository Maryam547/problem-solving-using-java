import java.util.Scanner;

public class CoordinatesOfPoint {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double x = myObj.nextDouble();
        double y = myObj.nextDouble();
        if(x==0&&y==0){
            System.out.println("Origem");
        }else if(x>=0.1&&y>=0.1){
            System.out.println("Q1");
        }else if(x>=0.1&&y<=-0.1){
            System.out.println("Q4");
        }else if(x<=-0.1&&y<=-0.1){
            System.out.println("Q3");
        }else if(x<=-0.1&&y>=0.1){
            System.out.println("Q2");
        }else if(x>=0&&x<0.1){
            System.out.println("Eixo Y");
        }else if(y>=0&&y<0.1){
            System.out.println("Eixo X");
        }
    }
}

