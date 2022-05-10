import java.util.Scanner;

public class fib1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for(int i=0;i<n;i++)
        System.out.print(fibn(i)+" ");   
    }
    private static int fibn(int n) {
       // System.out.println(n+":");
        return n<=1?n:fibn(n-1)+fibn(n-2);
    }
}
