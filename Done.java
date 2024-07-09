import java.util.Scanner;

public class Done {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        double x= (double) a / b ;
        System.out.println("Ket qua: " + x);
    }
}
