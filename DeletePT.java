import java.util.Arrays;
import java.util.Scanner;

public class DeletePT {
    public static void main(String[] args){
        int [] arr = {10, 12 ,5 ,6,15,7,9,3,2,0};
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter the position to delete: ");
        int position = sc.nextInt();
        if (position < 0 || position >= arr.length) {
            System.out.println("Position is not undefined!");
            return;
        }
        int[] newArr = new int[arr.length];
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        for (int i = position; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }
        System.out.println("Mang sau khi xoa la: " + Arrays.toString(newArr) );
    }
}
