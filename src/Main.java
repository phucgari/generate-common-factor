import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a: ");
        Scanner s=new Scanner(System.in);
        int a=Math.abs(s.nextInt());
        System.out.println("Enter b: ");
        int b=Math.abs(s.nextInt());
        if(a==0||b==0){
            System.out.println("No greatest common factor");
        }else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("greatest common factor: " + a);
        }
    }
}