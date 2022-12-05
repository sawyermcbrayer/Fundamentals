import java.util.ArrayList;
import java.util.Scanner;

public class OrderEngine {
    public static ArrayList<RoboticsOrders> order(){

        Scanner input = new Scanner(System.in);
        String userAcc;
        String customRobot = "null";
        ArrayList<RoboticsOrders> varRobots = new ArrayList<>();
        ArrayList<String> accList = new ArrayList<>();

        ConsoleFlush.flush();
        //validation loop
        boolean validType = false;
        while(!validType){
            System.out.println("Enter type of robot that you would like to customize here:");
            RoboticsOrders.typeInventory();
            customRobot = input.nextLine();
            customRobot =  customRobot.toUpperCase();
            if(customRobot.equals("MODULAR" )){
                validType = true;
            } else if (customRobot.equals("SINGLE FUNCTION")){
                validType = true;
            } else if (customRobot.equals("MULTIHEAD")){
                validType = true;
            } else {
                System.out.println("Robot type is invalid: Refer to list and try again.");
            }
        }
        //validation loop
        boolean quit2 = false;
        while(!quit2){

            RoboticsOrders.inventory();
            System.out.println("Enter robot accessories. Enter 0 to accessorize next robot.");
            userAcc = input.nextLine();
            userAcc = userAcc.toUpperCase();

            if(userAcc.equals("TOOL CHANGER")){
                accList.add(userAcc);
            } else if (userAcc.equals("FORCE SENSOR")){
                accList.add(userAcc);
            } else if (userAcc.equals("REMOVAL TOOL")){
                accList.add(userAcc);
            } else if (userAcc.equals("UTILITY COUPLER")){
                accList.add(userAcc);
            } else if (userAcc.equals("0")){
                varRobots.add(new RoboticsOrders(accList, customRobot ));
                quit2=true;
            } else{
                System.out.println("Part not found: Refer to list and try again.");
            }
        }
        return varRobots;
    }
}
