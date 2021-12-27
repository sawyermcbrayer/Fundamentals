public class getDurationString {
    public static String getDurationStrings(int minutes, int seconds){

        //validation
        if (minutes <  0 || seconds < 0 || seconds > 59){
            return"Invalid Value";
        }

        //calculation
        int hours = minutes / 60;
        int minuteRemainder = minutes % 60;
//        debug output:
//        System.out.println(hours + " Hours debug");
//        System.out.println(minuteRemainder + " minutes debug");
//        System.out.println(seconds + " seconds debug");

        //logic for leading 0
        if (hours < 10 && minuteRemainder < 10 && seconds < 10){
            return ("Hours: 0" + hours + " Minutes: 0" + minuteRemainder + " Seconds: 0" + seconds);

        } else if (hours >= 10 && minuteRemainder < 10 && seconds < 10){

            return ("Hours: " + hours + " Minutes: 0" + minuteRemainder + " Seconds: 0" + seconds);

        } else if (hours >=10 && minuteRemainder >= 10 && seconds < 10) {

            return ("Hours: " + hours + " Minutes: " + minuteRemainder + " Seconds: 0" + seconds);

        } else if (hours < 10 && minuteRemainder >= 10 && seconds < 10){

            return ("Hours: 0" + hours + " Minutes: " + minuteRemainder + " Seconds: 0" + seconds);

        } else if (hours >= 10 && minuteRemainder < 10){
// && seconds >=10
            return ("Hours: " + hours + " Minutes: 0" + minuteRemainder + " Seconds: " + seconds);

        } else if (hours < 10 && minuteRemainder < 10 && seconds>= 10){

            return ("Hours: 0" + hours + " Minutes: 0" + minuteRemainder + " Seconds: " + seconds);

        } else if (hours < 10 && minuteRemainder >= 10 && seconds>=10){

            return ("Hours: 0" + hours + " Minutes: " + minuteRemainder + " Seconds: " + seconds);

        }

        //in all other cases i.e. if all are above =>10
        return ("Hours: " + hours + " Minutes: " + minuteRemainder + " Seconds: " + seconds);
    }


    //method overloaded here
    public static String getDurationStrings(int seconds){

        //validation
        if (seconds < 0 ){
            return "Invalid Value";
        }


        //calculation
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;


        //call original method with overloaded data
        return getDurationStrings(minutes , remainingSeconds);
    }

}
