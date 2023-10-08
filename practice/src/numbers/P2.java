package numbers;

import java.util.Scanner;

public class P2 {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	  System.out.print("Enter the size of the array: ");
      int size = scanner.nextInt();

      int[] numbers = new int[size];

      // Get input values from the user and store them in the array
      for (int i = 0; i < numbers.length; i++) {
          System.out.print("Enter value for numbers[" + i + "]: ");
          numbers[i] = scanner.nextInt();
      }
 // Close the scanner

      // Calculate and print the sum of consecutive pairs of numbers
      for (int i = 0; i < numbers.length - 1; i += 2) {
          int sum = numbers[i] + numbers[i + 1];
          System.out.println("Sum of numbers[" + i + "] and numbers[" + (i + 1) + "]: " + sum);
      }
  }
}






















































