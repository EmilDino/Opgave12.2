import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.println("Enter two integers");
                int number1 = input.nextInt();
                int number2 = input.nextInt();

                System.out.println("The two numbers are " + number1 + " and " + number2);

                continueInput = false;
            }
            catch (InputMismatchException ex) {
                System.out.println(" you f'ed up mate, try again (" + "Incorrect input: an Integer is required you scrub)");
                input.nextLine();
            }
        }while (continueInput);
    }
}
