import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RoboticsMenu {
    public static void Menu(){
        //scanner instantiated
        Scanner input = new Scanner(System.in);
        //var declaration
        boolean exitValue = false;
        int userMenu;
        String userError;
        //Menu loop with validation begin
        System.out.println("Welcome to the ATI robot customization tool.");
        System.out.println("Use keypad to enter desired menu selection.");
        System.out.println("[1] Order\t[2] Revise\t[3]Checkout\t[0] ShutDown");
        while(!exitValue){
            //validation
            while(true){
                try{
                    userMenu = input.nextInt();
                    //validate positive value
                    while (userMenu < 0){
                        System.out.println("Negative values not allowed.\n");

                        System.out.println("Use keypad to enter desired menu selection.");
                        System.out.println("[1] Order\t[2] Revise\t[3]Checkout\t[0] ShutDown");
                        userMenu = input.nextInt();
                    }
                    //end inner loop if validated and continue outer loop
                    break;
                }catch(InputMismatchException exc){
                    //handle exception
                    userError = input.nextLine();
                    System.out.println("Invalid menu option: " + "\"" + userError + "\"" + "\n");
                    System.out.println("Use keypad to enter desired menu selection.");
                    System.out.println("[1] Order\t[2] Revise\t[3]Checkout\t[0] ShutDown");
                }
            }
            if(userMenu == 0){
                exitValue = true;
            } else if(userMenu == 1){
                //SPACE






                ConsoleFlush.flush();
                /*System.out.println("You entered: " + userMenu);
                String[] orderReturn = RoboticsOrders.Orders();
                for(int i =0; i < orderReturn.length; i ++){
                    System.out.print(orderReturn[i] + " ");
                }*/

                input.nextLine();
                String userAcc;
                ArrayList<RoboticsOrders> varRobots = new ArrayList<RoboticsOrders>();
                List<String> accList = new ArrayList<>();

                boolean quit = false;
                while(!quit){
                    quit = true;
                }

                boolean quit2 = false;
                while(!quit2){
                    RoboticsOrders.inventory();
                    System.out.println("Enter robot accessories. Enter 0 to quit.");
                    userAcc = input.nextLine();
                    userAcc = userAcc.toUpperCase();

                    if(userAcc.equals("ARM")){
                        System.out.println("Arm selected!");
                        accList.add(userAcc);
                    } else if (userAcc.equals("LEG")){
                        System.out.println("Leg selected!");
                        accList.add(userAcc);
                    }
                    else if (userAcc.equals("0")){
                        quit = true;
                    }
                }
                RoboticsOrders r1 = new RoboticsOrders(accList);
                System.out.println(r1);


                System.out.println("\n");
                System.out.println("Use keypad to enter desired menu selection.");
                System.out.println("[1] Order\t[2] Revise\t[3]Checkout\t[0] ShutDown");





                //SPACE
            } else if (userMenu == 2){
                ConsoleFlush.flush();
                System.out.println("You entered: " + userMenu);
            } else if(userMenu == 3){
                ConsoleFlush.flush();
                System.out.println("You entered: " + userMenu);
            } else if (userMenu == 4){
                ConsoleFlush.flush();
                System.out.println("You entered: " + userMenu);
            } else {
                ConsoleFlush.flush();
                System.out.println("Entry: " + userMenu + " not recognized. ");
                System.out.println("Use keypad to enter desired menu selection.");
                System.out.println("[1] Order\t[2] Revise\t[3]Checkout\t[4]Cart\t[0] ShutDown");
            }


        //while !exitValue end
        }


    //class / robot end
    }
}
