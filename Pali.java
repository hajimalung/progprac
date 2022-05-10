import java.util.Scanner;

public class Pali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        String str2 = sb.reverse().toString();
        if(str.equals(str2)){
            System.out.println("palindrome");
        }else System.out.println("not a palindrome");
    }   
}
