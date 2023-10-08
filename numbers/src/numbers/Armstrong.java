package numbers;

public class Armstrong {

    public static void main(String[] args) {
        int n = 153;
        int m = n;

        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            int cube = rem * rem * rem;  
            sum = sum + cube;
            n = n / 10;
        }
System.out.println(sum);
        if (m == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not an Armstrong");
        }
    }
}
