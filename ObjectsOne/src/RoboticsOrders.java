import java.util.List;

public class RoboticsOrders {
    String robotType;
    List<String> robotAccessory;

    RoboticsOrders(List<String> acc1){
        robotType = "Generic";
        robotAccessory = acc1;
    }
    static void inventory(){
        System.out.println("Type: Modular, Single");
        System.out.println("Accessories: Arm, Leg");
    }



    @Override
    public String toString() {
        return "Robot type: " + robotType + "\nAccessories added: " + robotAccessory;
    }

}
