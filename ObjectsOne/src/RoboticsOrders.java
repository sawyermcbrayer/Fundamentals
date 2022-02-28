import java.util.Arrays;

public class RoboticsOrders {
    String robotType;
    String robotAccessory;
    RoboticsOrders(){
        robotType = "Generic";
        robotAccessory = "Blank Robot";
    }

    public static String[] Orders(){
        int numRobots = 0;
        int numRobotParts = 0;

        String[] myList = new String[5];
        Arrays.fill(myList, "one");
        return myList;
    }
}
