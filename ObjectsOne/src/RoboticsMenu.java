import java.util.InputMismatchException;
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
                ConsoleFlush.flush();
                System.out.println("You entered: " + userMenu);
                String[] orderReturn = RoboticsOrders.Orders();
                for(int i =0; i < orderReturn.length; i ++){
                    System.out.print(orderReturn[i] + " ");
                }
                System.out.println("\n");
                System.out.println("Use keypad to enter desired menu selection.");
                System.out.println("[1] Order\t[2] Revise\t[3]Checkout\t[0] ShutDown");
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
