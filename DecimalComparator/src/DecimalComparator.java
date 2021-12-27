public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double one , double two){
        int number1 = (int) (one * 1000);
        int number2 = (int) (two * 1000);
        if (number1 == number2){
            return true;
        } else{
            return false;
        }
    }
}
