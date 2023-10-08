package numbers;

public class Sunnynumber {
public static void main(String[] args) {
	int num=4;
	int n=num+1;
	boolean flag=false;
	for(int i=1;i<=n;i++) {
		if(i*i==n) {
			System.out.println("Sunny number");
		    flag=true;
		}
		}
	if(flag==false) {
		System.out.println("not a perfect square");
	}
	}
}

