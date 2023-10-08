package numbers;

import java.util.Scanner;

public class SumofDigits {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for numbers ");
        int size = scanner.nextInt();
        int[]numbers= new int[size]; // Array of size 8

        // Get input values from the user and store them in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter value for numbers[" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        scanner.close(); // Close the scanner

        // Calculate the sum of values at odd positions (1, 3, 5, 7)
        int sum = 0;
        for (int i = 1; i < numbers.length; i ++) {
        	if(i%2==0) {
            sum =sum+ numbers[i];
        	}
        }

        // Print the sum of values at odd positions
        System.out.println("Sum of values at odd positions: " + sum);
    }
}




