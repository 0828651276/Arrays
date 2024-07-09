
import java.util.Scanner;
public class hienthimangvuatao {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Moi ban nhap so phan tu cua mang");
            int arrayLength = sc.nextInt();
            int[] arrayNum = new int[arrayLength];
            for (int i = 0; i < arrayNum.length; i++) {
                System.out.println("Moi ban nhap phan tu thu " + i);
                arrayNum[i] = sc.nextInt();
            }
            System.out.println("Mang ban vua nhap la");
            for (int i = 0; i < arrayNum.length; i++) {
                System.out.println(arrayNum[i]);
            }
        }

}
