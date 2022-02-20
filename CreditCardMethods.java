public class CreditCardMethods {
    /*public static long reverse(long n){
        long rev = 0;
        while (n != 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev;
      } */

    public static String cardType(long number){
        long firstDigit = Long.parseLong(Long.toString(number).substring(0, 1));
        if(firstDigit == 4){
            return "Visa";
        } else if(firstDigit == 5){
            return "Master Card";
        } else if (firstDigit == 6){
            return "Discover Card";
        } else if (firstDigit == 3){
            return "American Express";
        } else {
            return "Mystery Card Type";
        }
    }

    /* Return true if the card number is valid */
    public static boolean isValid(long number){
        return number % 10 == 0;
    }

    /* Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number){
        long numberHolder = number;
        long evenSum = 0;
        for(int i = 1; i <= String.valueOf(numberHolder).length(); i++ ){
            if (i % 2 == 0){
                //if doubled and above
                System.out.println(number % 10);
                if ((number % 10) * 2 > 9){
                    evenSum += ((number%10) * 2) - 9;
                } else {
                    evenSum += (number % 10) * 2;
                }
            }
            number /= 10;
        }
        return (int) evenSum;
    }

    /*
     * Return this number if it is a single digit, otherwise, return the sum of the
     * two digits
     */

    public static int getDigit(int number){
        return 0;
    }

    /* Return sum of odd place digits in number */
    public static int sumOfOddPlace(long number) {
        //number = reverse(number);
        long numberHolder = number;
        long oddSum = 0;
        for(int i = 1; i <= String.valueOf(numberHolder).length(); i++){
            if (i%2 != 0){
                oddSum += number % 10;
            }
            number /= 10;
        }
        return (int) oddSum;
    }

    /* Return true if the number d is a prefix for number */
    public static boolean prefixMatched(long number, int d){
        return false;
    }

    /* Return the number of digits in d */
    public static int getSize(long d){
        return String.valueOf(d).length();
    }

    /*
     * Return the first k number of digits from number. If the number of digits in
     * number is less than k, return number.
     */
    public static long getPrefix(long number, int k){
        return 5;
    }
}
