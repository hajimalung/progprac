import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r =1 ;
        while(n>0){
            r*=n;
            n=n-1;
        }
        System.out.println(r);
    }
    
}
