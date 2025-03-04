import java.util.Scanner;
 public class Atm {

    public static void main(String[] args) {
        int correctPin = 1234;
        int maxAttempts = 3;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        while (attempts < maxAttempts) {
            System.out.print("Enter your PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == correctPin) {
                System.out.println("PIN correct. You can proceed.");
                break;
            } else if (attempts < maxAttempts - 1) {
                attempts++;
                System.out.println("Incorrect PIN. " + (maxAttempts - attempts) + " attempts left.");
            } else {
                attempts++;
                System.out.println("Incorrect PIN. Your account is locked.");
            }
        }

        scanner.close();
    }
}
