package pattern_programs;
//Important
public class PyramidLetters {
	public static void main(String[] args) {
		
	char ch='A';

for(int i=1;i<=5;i++) {
//	char ch='A';//reinitialized
	for(int j=1;j<=i;j++) {
		
		System.out.print(ch);
		ch++;
	}
	System.out.println();
}
	}
	
}
