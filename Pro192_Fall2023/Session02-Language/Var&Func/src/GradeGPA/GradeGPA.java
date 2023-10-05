
package GradeGPA;

import java.util.Scanner;
import java.text.DecimalFormat;
        
public class GradeGPA {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        DecimalFormat dc= new DecimalFormat("#.##");
        
        System.out.print("Input attendence rate: ");
        int attend = sc.nextInt();
        System.out.print("Input midterm score:");
        int mid = sc.nextInt();
        System.out.print("Input final exam score:");
        int finalex = sc.nextInt();
        
        int GPA = (attend*10 + mid*20 + finalex*70)/100;
        System.out.printf("Your average grade is:%d\n",GPA);
        
        
    }
    
}
