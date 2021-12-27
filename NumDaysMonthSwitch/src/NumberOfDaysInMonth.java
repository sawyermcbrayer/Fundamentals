public class NumberOfDaysInMonth {
    //-------------------------------------METHOD ONE--------------------------------------------------------------
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        //when if statement goes return TRUE , else return FALSE you can do this syntax line #8
        return (year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0);
    }

//---------------------------------------METHOD TWO------------------------------------------------------------

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        //get data for leap year
        boolean leapResult = isLeapYear(year);

        //reaching-----reaching worked...if there is a hard to figure out required return look at this
        //example of storing it into a variable and then returning that variable ex. days in this case

        int days =0;

        //switch to figure out month days to return....
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if (leapResult){
                    days = 29;
                } else days = 28;
                break;
            default:
                System.out.println("Invalid entry...");
                break;
        }

        return days;

    }
}