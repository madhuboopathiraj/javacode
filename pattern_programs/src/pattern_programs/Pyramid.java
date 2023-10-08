package pattern_programs;

public class Pyramid {

public static void main(String[] args) {
	int r=5;
	
	for(int i=1;i<=r;i++) {
		for(int c=1;c<=i;c++) {
			System.out.print(c);
		}
		System.out.println();
	}
}
}
