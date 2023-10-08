package numbers;

import java.util.Scanner;

public class P1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Array value");
	int n=sc.nextInt();
	int[]num= new int[n];
	for(int i=0;i<num.length;i++) {
		System.out.println("enter value for index "+i+"");
		num[i]=sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<num.length;i++) {
		if(i%2==0) {
			sum=sum+num[i];
		}
	}System.out.println(sum);
}
}
