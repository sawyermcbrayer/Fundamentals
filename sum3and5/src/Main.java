public class Main {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;


        for (int i=1; i<= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                counter++;
                sum += i;
                System.out.println("This number is divisible by 3 and 5: " + i);

            }
            if (counter == 5){
                break;
            }
        }
        System.out.println();
        System.out.println("The sum of those numbers is: " + sum);

    }
}
