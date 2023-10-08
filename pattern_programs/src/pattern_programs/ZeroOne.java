package pattern_programs;

public class ZeroOne {
public static void main(String[] args) {
	int r=5;
	for (int i=1;i<=r;i++) {
		for(int c=1;c<=i;c++) {
			if(c%2==0) {
				System.out.print("0");
			}else {
				System.out.print("1");
			}
		
		}
		System.out.println("");
}
}
}
