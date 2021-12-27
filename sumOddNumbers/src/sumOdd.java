//no main.java calls, just ran through main. add main to this file to run
public class sumOdd {
    public static boolean isOdd(int number){
        if (number<1){
            return false;
        }
        if (number % 2 != 0){
            return true;
        } else {
            return false;
        }

    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if ((start < 1) || (end < 1) || (start > end)){
            System.out.println("Invalid input: End must be > start and both numbers must be > 0!");
            return -1;
        }
        for (int i = start; i <= end; i++){

            if (isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}
