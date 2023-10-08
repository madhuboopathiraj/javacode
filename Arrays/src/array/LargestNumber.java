package array;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] values = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }
        System.out.println("Largest number"+" " +max(values));
        System.out.println("Smallest number"+" "+min(values));
        System.out.println("2nd largest number"+" "+secmax(values));
System.out.println(values.length);
       
    }
    static int max(int[]values) {
    	int maxval=values[0];
    	for(int i=1;i<values.length;i++) {
    		if(values[i]>maxval) {
    			maxval=values[i];
    		}
    	}
		return maxval;
    	
    }static int min(int[]values) {
    	int minval=values[0];
    	for(int i=1;i<values.length;i++) {
    		if(values[i]<minval) {
    			minval=values[i];
    		}
    	}
		return minval;
    }
    static int secmax(int[]values) {
    	int secval=values[0];
    	for(int i=values.length-2;i>=0;i--) {
    		if(values[i]!=secval) {
    			secval=values[i];
    		}
    	}
		return secval;
}
}
