import java.util.ArrayList;

public class RoboticsOrders {
    private String robotType;
    private ArrayList<String> robotAccessory;

    RoboticsOrders(ArrayList<String> acc1 , String test){
        this.robotType = test;
        this.robotAccessory = acc1;
    }

    static void typeInventory() {
        System.out.println("Modular, Single Function, MultiHead");
    }
    static void inventory(){
        System.out.println("Available Accessories: Tool Changer, Force Sensor, Removal Tool, Utility Coupler");
    }

    @Override
    public String toString() {
        return "Robot type: " + robotType + "\t Accessories added: " + robotAccessory;
    }

}
