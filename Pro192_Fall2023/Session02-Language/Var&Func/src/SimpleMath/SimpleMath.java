
package Simple.math;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleMath {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        
        System.out.printf("Input 1st number to calculate:");
        int firstNum = sc.nextInt();
        System.out.printf("Input 2nd number to calculate:");
        int secondNum = sc.nextInt();
        
        //Tính tổng hiệu tích thương
        int tong = firstNum + secondNum;
        System.out.println(firstNum+"+"+secondNum+"="+tong);
        
        int hieu = firstNum - secondNum;
        System.out.println(firstNum+"-"+secondNum+"="+hieu);
        
        int tich = firstNum * secondNum;
        System.out.println(firstNum+"x"+secondNum+"="+tich);
        
        float thuong = (float) firstNum / secondNum;
        System.out.println(firstNum+ "/" +secondNum+ "=" +thuong);
        
    }
    
}
