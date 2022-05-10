import java.util.Scanner;

/**
 * leap
 */
public class leap {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int yr = sc.nextInt();
    if(yr%4==0)System.out.println("leap year!!");
        else System.out.println("not leap year!!");
    }
}