package pattern_programs;

public class Alphabetstask2 {
public static void main(String[] args) {
	char ch='Z';
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(ch--);
		}System.out.println();
	}
}
}
