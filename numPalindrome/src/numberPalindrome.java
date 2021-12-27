public class numberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;

        if (number < 0 ){
            number = number * -1;
        }
        int initialNumber = number;
        while (number > 0) {

            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number = number / 10;
        }
        return initialNumber == reverse;
    }
}
