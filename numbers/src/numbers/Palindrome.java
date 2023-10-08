package numbers;

public class Palindrome {
    public static void main(String[] args) {
        int num = 141;
        int rev = 0;
        
        int originalNum = num; // Store the original number
        
        while (num != 0) {
            int l = num % 10;
            rev = rev * 10 + l;
            num =num/ 10; // Update num by removing the last digit
        }
        
        if (originalNum == rev) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
