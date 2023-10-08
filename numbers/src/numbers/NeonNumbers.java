package numbers;

public class NeonNumbers {

public static void main(String[] args) {
	int num=9;
	int sq=num*num;
	int sum=0;
	while(sq!=0) {
	int l=sq%10;
	sum=sum+l;
	sq=sq/10;
	
	}if(sum==num) {
		System.out.println("neon");
	}else {
		System.out.println("not neon");
	}
}
}
