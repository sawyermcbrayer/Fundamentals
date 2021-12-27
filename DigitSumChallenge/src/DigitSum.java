public class DigitSum {
//use n%10 to extract least significant digit
    //use n= n/10 to discard least significant
    public static int sumDigits (int number) {
        if (number < 10) {
            System.out.println("Invalid input. Numbers cannot be negative or below 10!");
            return -1;
        }
//********************************************************************************************
        int sum = 0;
        int counter = 0;
        String numberLen = String.valueOf(number);
        int lengthHere  = numberLen.length();


        do {
            counter++;
            int output = number % 10;
            sum = sum + output;
            number = number / 10;

        } while (counter <= lengthHere);

        System.out.println("Sum of individual numbers composing digit is: " + sum);
        return sum;

    }
}
