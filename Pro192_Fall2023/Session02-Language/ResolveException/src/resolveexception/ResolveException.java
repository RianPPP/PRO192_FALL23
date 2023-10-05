/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolveexception;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class ResolveException {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;

        do {
            
            System.out.print("Enter a: ");
            String aString = scanner.nextLine();
            System.out.print("Enter b: ");
            String bString = scanner.nextLine();

            try {
                a = Double.parseDouble(aString);
                b = Double.parseDouble(bString);

                if (b == 0) {
                    throw new ArithmeticException();
                }

                break;
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter two numbers!");
            } 
              catch (ArithmeticException e) {  
                System.out.println("Division by zero is not allowed!");
            }

        } while (true);

        double Sum = a + b;
        double Difference = a - b;
        double Product = a * b;
        double Quotient = a / b;

        System.out.println("Sum of two numbers: " + Sum);
        System.out.println("Difference of two numbers: " + Difference);
        System.out.println("Product of two numbers: " + Product);
        System.out.println("Quotient of two numbers: " + Quotient);
    }
}