import java.util.Scanner;

public class KPairs {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,7};   
        int k =7;
        String indexes = "";        //   0 , 1, 3
	    for(int i=0;i<arr.length;i++){
	        if(arr[i] <= k ){
 		        indexes += i + ",";
		        k -= arr[i];
	        }
	    }
	    System.out.println(indexes);	
    }
}
