package numbers;

import java.util.Scanner;

public class Datatypes {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String input = scanner.nextLine();
        scanner.close();

        if (input.matches("-?\\d+")) {
            System.out.println("Input is of type: Integer");
        } else if (input.matches("-?\\d+\\.\\d+")) {
            System.out.println("Input is of type: Float");
        } else if (input.matches("-?\\d+\\.\\d+[dD]?")) {
            System.out.println("Input is of type: Double");
        } else if (input.length() == 1) {
            System.out.println("Input is of type: Character");
        } else if (input.matches("-?\\d+[lL]?")) {
            System.out.println("Input is of type: Long");
        } else {
            System.out.println("Input type is not recognized.");
        }
    }
}
