import java.util.Scanner;

public class Rnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int revNum=0;
        while(n>0){
            revNum = (revNum*10) + (n%10);
            n=n/10;
        }
        System.out.println(revNum);
    }
    
}
