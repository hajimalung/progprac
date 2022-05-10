import java.util.Scanner;

public class PFact {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     findPFact(n);
 }

private static void findPFact(int n) {
    while(n%2==0){
        System.out.print("2 ");
        n=n/2;
    }
    int temp = (int) Math.sqrt(n);
    for(int i=3;i<temp;i+=2){
        if(n%i==0 && isPrime(i) ){
            System.out.print(i + " ");
            n=n/i;
        }
    }
    if(n>2)System.out.print(n);
}

private static boolean isPrime(int n) {
    if(1<=n && n<=2) return true;
    for(int i=3;i<n/2;i++){
        if(n%i==0)return false;
    }
    return true;
}   
}