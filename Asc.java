import java.util.Arrays;
import java.util.Scanner;

public class Asc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
    
}
