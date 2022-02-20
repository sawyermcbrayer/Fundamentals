import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This program will check credit card number for Luhn validity.");
        System.out.print("Enter a credit card number here. ");
        long userInput = input.nextLong();

        int resultEven = CreditCardMethods.sumOfDoubleEvenPlace(userInput);
        System.out.println("Even Place Sum: " + resultEven);

        int resultOdd = CreditCardMethods.sumOfOddPlace(userInput);
        System.out.println("Odd Place Sum: " + resultOdd);

        int numberOfNums = CreditCardMethods.getSize(userInput);
        System.out.println("Credit Card # length: " + numberOfNums);

        String cardDigit = CreditCardMethods.cardType(userInput);
        System.out.println(cardDigit + " Detected...");

        boolean isValidResult = CreditCardMethods.isValid((long)resultEven+resultOdd);
        System.out.println("Is the number valid?: " + isValidResult);
    }
}
