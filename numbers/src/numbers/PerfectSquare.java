package numbers;

import java.util.Scanner;

public class PerfectSquare {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	for(int i=1;i<=num/2;i++) {
		if(i*i==num) {
			System.out.println("perfect sqaure");
		}else {
			System.out.println("Not a perfect square");
		}
	}
}
}
