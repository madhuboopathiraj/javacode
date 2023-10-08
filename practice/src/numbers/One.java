package numbers;

import java.util.Scanner;

public class One {
 public static void main(String[] args) {
	
	 Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a character: ");
     char inputChar = scanner.next().charAt(0);

     if (inputChar >= 'A' && inputChar <= 'Z') {
         System.out.println("1");
     }if(inputChar>='a'&& inputChar<='z') {
    	 System.out.println("0");
     }else {
    	 System.out.println(-1);
     }

     scanner.close();
 }
}

