//import stuff here
import java.util.Scanner;
//Your code here
public class Program8 {
    public static void main (String args[]) {
        
        //scanner
        Scanner myScanner = new Scanner (System.in);
        
        //declare variables
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        int difference = 0;
        int product = 0;
        double avg = 0.0;
        int distance = 0;
        int max = 0;
        int min = 0;
        
        //ask for user input
        System.out.println("Enter number 1: ");
        num1 = myScanner.nextInt();
        
        System.out.println("Enter number 2: ");
        num2 = myScanner.nextInt();
        
        //calculations
        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        avg = (num1 + num2) / 2.0;
        distance = Math.abs(difference);
        max = (sum + distance) / 2;
        min = (sum - distance) / 2;
        
        //print results
        System.out.println("Original numbers are " + num1 + " and " + num2);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Average = " + avg);
        System.out.println("Absolute value = " + distance);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
//Paste console output below:
/*
Enter number 1: 
13
Enter number 2: 
20
Original numbers are 13 and 20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Absolute value = 7
Maximum = 20
Minimum = 13

*/
