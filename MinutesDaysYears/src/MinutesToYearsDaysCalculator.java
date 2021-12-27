public class MinutesToYearsDaysCalculator {
    private static final String INVALID_INPUT_MESSAGE = "Invalid Value";
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println(INVALID_INPUT_MESSAGE);
        } else {
            long hours = minutes / 60L;
            long days = hours / 24L;
            long years = days / 365L;
            long daysRemainder = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + daysRemainder + " d");
        }
    }
}
