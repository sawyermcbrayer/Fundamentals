import java.util.Scanner;
public class Loop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("[0] to exit\n[1] Option 1\n[2] Option 2\n[3] Option 3\n[4] Option 4\n[5] Option 5\n[6] Option 6");
            System.out.println("Enter a number from 0 to " + 5 + " : ");
            option = scanner.nextInt();
            scanner.nextLine();
            // bunch of if statements and/or switch statement
            if (option == 1){
                System.out.println("You selected option #1");
                System.out.println("Enter any key to continue...");
                scanner.nextLine();
            } else if (option == 2){
                System.out.println("You selected option #2");
                System.out.println("Enter any key to continue...");
                scanner.nextLine();
            } else if (option == 3){
                System.out.println("You selected option #3");
                System.out.println("Enter any key to continue...");
                scanner.nextLine();
            } else if (option == 4){
                System.out.println("You selected option #4");
                System.out.println("Enter any key to continue...");
                scanner.nextLine();
            } else if (option == 5){
                System.out.println("You selected option #5");
                System.out.println("Enter any key to continue...");
                scanner.nextLine();
            } else if (option == 6){
                System.out.println("You selected option #6");
                System.out.println("Enter any key to continue...");
                scanner.nextLine();
            } else if (option == 0 ){
                System.out.println("Exiting program properly, hang tight...");
            } else {
                System.out.println("Hmm, invalid input...try again with 0-6");
                option = 1;
            }

        } while (option >= 1 && option <= 5);
    }
}
