package pattern_programs;

public class PyramidNumbers {
	public static void main(String[] args) {
		
	
int r=5;
int count=0;
for(int i=1;i<=r;i++) {
	for(int c=1;c<=i;c++) {
		count++;
		System.out.print(count);
	}
	System.out.println();
}
}
}