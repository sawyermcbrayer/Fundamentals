import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int objectNum;
        String roboType;
        String roboAcc;

        //choose n robot(s)
        System.out.println("How many robots would you like to create?");
        objectNum = input.nextInt();

        //object list declared
        Robots[] robots = new Robots[objectNum];
        //loop for customization options for n robot(s)
        for (int i = 0; i < objectNum; i++) {
            System.out.println("Robot: " + (i + 1));

            System.out.print("Enter robot type: ");
            Robots.typeInventory();
            roboType = input.next();

            System.out.print("Enter robot accessories: ");
            Robots.accInventory();
            roboAcc = input.next();


            //create and set object with user vars
            robots[i] = new Robots("null", "null");
            robots[i].setType(roboType);
            robots[i].setAcc(roboAcc);
        }
        //success prompt and list objects created
        System.out.println("Robot creation successful!");
        for (int i = 0; i < objectNum; i++) {
            System.out.println("Robot " + (i + 1) + ":\n");
            System.out.print("Robot Type: " + robots[i].getType() + "\n");
            System.out.print("Robot Accessories: " + robots[i].getAcc() + "\n");

        }
        //Loop for what user wants to do with their robots.
        boolean exitVal = false;
        int menuChoice;
        while (!exitVal) {
            System.out.println("Welcome to ATI Robot Creation/Use Tool");
            System.out.println("[1]Modify\t[2]Use\t[3]Exit");
            menuChoice = input.nextInt();

            if (menuChoice == 1) {

                //------------------MODIFICATION--------------------------

                System.out.println("Which would you like to modify?");
                for (int i = 0; i < objectNum; i++) {
                    System.out.println("Robot: [" + (i + 1) + "]");
                }
                int robotModChoice;
                int attributeModChoice;
                String typeChange;

                robotModChoice = input.nextInt();
                System.out.println("Which attribute of robot would you like to modify?");
                System.out.println("[1] Robot Type\t[2] Robot Accessory\t[3] Robot Color");
                attributeModChoice = input.nextInt();

                if (attributeModChoice == 1) {
                    System.out.println("What would you like to change robot type to?");
                    Robots.typeInventory();
                    typeChange = input.next();
                    robots[robotModChoice - 1].setType(typeChange);
                    System.out.println("Robot " + (robotModChoice) + ":\n");
                    System.out.print(robots[robotModChoice - 1].getType() + "\t");
                    System.out.print(robots[robotModChoice - 1].getAcc() + "\t");

                } else if (attributeModChoice == 2) {
                    System.out.println("What would you like to change robot accessories to?");
                    Robots.accInventory();
                    typeChange = input.next();
                    robots[robotModChoice - 1].setAcc(typeChange);
                    System.out.println("Robot " + (robotModChoice) + ":\n");
                    System.out.print(robots[robotModChoice - 1].getType() + "\t");
                    System.out.print(robots[robotModChoice - 1].getAcc() + "\t");

                }
            } else if (menuChoice == 2) {
                // -------------USE OF OBJECTS---------------------
                int userJobType;
                System.out.println("Menu choice 2");
                System.out.println("Select the job type you want to perform: ");
                System.out.println("[1] Drilling\n[2] Cutting");
                userJobType = input.nextInt();
                //confirm object of proper robot type exists
                if(userJobType == 1){
                    boolean properConfig = false;
                    for (int i = 0; i < objectNum; i++){
                        if(robots[i].getType().equals("DRILLING") && robots[i].getAcc().equals("BIT")){
                            System.out.println("Robot " + i +" : has proper drilling config");
                            properConfig = true;
                        }else {
                            System.out.println("Robot " + i +" : does not have proper drilling configuration.");
                        }
                    }
                    //use robot if configuration is correct
                    if(properConfig){
                        double drillDepth = 0;
                        System.out.println("Enter depth of hole to be drilled in millimeters.");
                        drillDepth = input.nextDouble();

                        while(drillDepth > 0){
                            System.out.print("Working....");
                            System.out.printf("Remaining distance to cover: " + "%.2f\n" , drillDepth);
                            drillDepth -= .01;
                        }
                        System.out.println("Drill success");
                    }
                } else if (userJobType == 2 ){
                    boolean properConfig = false;
                    for (int i = 0; i < objectNum; i++){
                        if(robots[i].getType().equals("CUTTING") && robots[i].getAcc().equals("BLADE")){
                            System.out.println("Robot "+ i + ": has proper cutting configuration.");
                            properConfig = true;
                        }else {
                            System.out.println("Robot "+ i + ": does not have proper cutting configuration.");
                        }
                    }
                    if(properConfig){
                        double cutDistance = 0;
                        System.out.println("Enter distance to cut in millimeters");
                        cutDistance = input.nextDouble();

                        while(cutDistance > 0){
                            System.out.print("Working....");
                            System.out.printf("Remaining distance to cover: " + "%.2f\n" , cutDistance);
                            cutDistance -= .05;
                        }
                        System.out.println("Drill success");
                    }
                }
            } else if (menuChoice == 3) {
                //end program sequence
                System.out.println("Program ended successfully");
                exitVal = true;
            }
            //end menu loop
        }
        //end main loop
    }
//end class loop
}
