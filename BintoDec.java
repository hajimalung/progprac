import java.util.Scanner;

public class BintoDec {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String binNum = sc.nextLine();
        int decNum = Integer.parseInt(binNum,2);
        System.out.println(decNum);
    }
    
}
