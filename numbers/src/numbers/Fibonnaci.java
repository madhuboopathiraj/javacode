package numbers;
//fibonnaci series of first 10 numbers
public class Fibonnaci {
public static void main(String[] args) {
	int n1=0;
	int n2=1;
	System.out.println(n1);
	System.out.println(n2);
	
	for(int i=2;i<=10;i++) {
		
		int n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
	}
}
}
