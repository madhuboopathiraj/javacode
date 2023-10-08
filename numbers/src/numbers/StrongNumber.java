package numbers;
//sum of factorial of each number is strong number
public class StrongNumber {
	public static void main(String[] args) {
		int sum=0;	
	int n=145;
	int f=n;
while(n>0) { //145>0 ===true
	int rem=n%10; //145%10==5
	int fact=1;
	
	for(int i=1;i<=rem;i++) {  //i<=5
		fact=fact*i;           //1=1*1
	}
	
	sum=sum+fact;              //0=0+1
	n=n/10;                    // n = 145 / 10 = 14 (next iteration)
	
	
}
System.out.println(sum);
if(f==sum) {
	System.out.println("strong number");
}else
{
	System.out.println("not an strong number");
}
}
	
}
