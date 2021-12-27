public class Main {
    public static void main(String[] args) {
        int output = sumOdd(1,11);
        System.out.println(output);
    }
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
