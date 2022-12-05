import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RoboticsMenu {
    public static void Menu(){

        int roboCount = 0;
        int deleteItem;
        int numRobo;
        int userMenu;
        boolean exitValue = false;
        String userError;
        ArrayList<Object> orderResult = new ArrayList<>();

        //scanner instantiated
        Scanner input = new Scanner(System.in);

        //Menu loop with validation begin
        System.out.println("Welcome to the ATI robot customization tool.");
        System.out.println("Use keypad to enter desired menu selection.\n");
        System.out.println("[1] Order\t[2] Delete\t[3]Checkout\t[4] Cart\t[0] ShutDown");
        while(!exitValue){
            //validation
            while(true){
                try{
                    userMenu = input.nextInt();
                    //validate positive value
                    while (userMenu < 0){
                        System.out.println("Negative values not allowed.\n");
                        System.out.println("Use keypad to enter desired menu selection.");
                        System.out.println("[1] Order\t[2] Delete\t[3]Checkout\t[0] ShutDown");
                        userMenu = input.nextInt();
                    }
                    //end inner loop if validated and continue outer loop
                    break;
                }catch(InputMismatchException exc){
                    //handle exception
                    userError = input.nextLine();
                    System.out.println("Invalid menu option: " + "\"" + userError + "\"" + "\n");
                    System.out.println("Use keypad to enter desired menu selection.");
                    System.out.println("[1] Order\t[2] Delete\t[3] Checkout\t[0] ShutDown");
                }
            }

            //---------------------------------------------------------------------------------------

            //handle user menu selection
            if(userMenu == 0){
                exitValue = true;
            } else if(userMenu == 1){
                System.out.println("[1]: How many robots would you like to order?");
                while(true){
                    try{
                        numRobo = input.nextInt();
                        //validate positive value
                        while (numRobo < 0){
                            System.out.println("Negative values not allowed.\n");
                            System.out.println("[1]: How many robots would you like to order?");
                            numRobo = input.nextInt();
                        }
                        //end inner loop if validated and continue outer loop
                        break;
                    }catch(InputMismatchException exc){
                        //handle exception
                        input.nextLine();
                        System.out.println("Invalid menu option.\n");
                        System.out.println("[1]: How many robots would you like to order?");
                    }
                }

                roboCount += numRobo;
                //create n number of objects based on user selection
                for(int i = 0; i < numRobo; i ++){
                    orderResult.add(OrderEngine.order());
                }
                System.out.println("Number of Robots: " + roboCount + "\n" +
                        orderResult);
                System.out.println("Use keypad to enter desired menu selection.");
                System.out.println("[1] Order\t[2] Delete\t[3]Checkout\t[4]Cart\t[0] ShutDown");

            } else if (userMenu == 2){

                ConsoleFlush.flush();

                //validate user input and handle accordingly if valid
                System.out.println("[2]: Which order would you like to Delete?");
                while(true){
                    try{
                        deleteItem = input.nextInt();
                        //validate positive value
                        while (deleteItem < 1){
                            System.out.println("Number must be at least 1.\n");
                            System.out.println("[2]: Which order would you like to Delete?");
                            deleteItem = input.nextInt();
                        }
                        //end inner loop if validated and continue outer loop
                        break;
                    }catch(InputMismatchException exc){
                        //handle exception
                        input.nextLine();
                        System.out.println("Invalid menu option.\n");
                        System.out.println("[2]: Which order would you like to Delete?");
                    }
                }

                if(orderResult.size() > 0){
                    if (deleteItem > orderResult.size()){
                        System.out.println("Number too large, check item count with menu option [4]");
                    } else {
                        DeleteOrder.delete(orderResult , deleteItem);
                        roboCount--;
                    }
                } else {
                    System.out.println("Cart is empty.");
                }
                System.out.println("[1] Order\t[2] Delete\t[3]Checkout\t[4]Cart\t[0] ShutDown");

            } else if(userMenu == 3){

                ConsoleFlush.flush();
                //export user cart to text file for company to receive
                for(int i = 0; i < orderResult.size(); i++){
                    roboCount--;
                }
                PlaceOrder.sendOrder(orderResult);
                System.out.println("[1] Order\t[2] Delete\t[3]Checkout\t[4]Cart\t[0] ShutDown");

            } else if (userMenu == 4){

                ConsoleFlush.flush();
                //display customers current cart items
                System.out.println("Shopping cart size:" + roboCount + "\n" +  orderResult);
                System.out.println("[1] Order\t[2] Delete\t[3]Checkout\t[4]Cart\t[0] ShutDown");

            }
        //While !exitValue End
        }
    //Menu End
    }
    //Class End
}
