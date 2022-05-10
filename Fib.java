import java.util.Scanner;
public class Fib {
    public static void main(String[] args) {
        int a=1,b=1,n;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        System.out.print(a+"\t"+b+"\t");
        for(int i=2;i<n;i++){
            System.out.print(a+b+"\t");
            int t = a;
            a = b;
            b += t; 
        }
    }
    
}
