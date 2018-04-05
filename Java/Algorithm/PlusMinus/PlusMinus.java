import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class AlgorithmPlusMinus {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        int z=0,p=0,n=0,i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==0){
                z++;
            }
        }
        
        for(i=0;i<arr.length;i++){
            if(arr[i]>0){
                p++;
            }
        }
        
        for(i=0;i<arr.length;i++){
            if(arr[i]<0){
                n++;
            }
        }
        double pp=(double)p/arr.length;
        double pn=(double)n/arr.length;
        double pz=(double)z/arr.length;
        
        
        DecimalFormat df = new DecimalFormat("#.######");
        df.setRoundingMode(RoundingMode.HALF_DOWN);
        NumberFormat formatter = new DecimalFormat("#0.000000");
        
        System.out.println(formatter.format(pp));
        System.out.println(formatter.format(pn));
        System.out.println(formatter.format(pz));
        
        
        /*
         * Write your code here.
         */

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}
