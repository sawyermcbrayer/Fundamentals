import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PlaceOrder {
    public static ArrayList<Object> sendOrder(ArrayList<Object> order){
        try {
            FileOutputStream fos = new FileOutputStream("CustomerOrder");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(order.toString());
            oos.close();
        } catch(Exception ex) {
            ex.printStackTrace();
            System.out.println("Issue placing order.");
        }

        System.out.println("Order received!");
        order.removeAll(order);
        return order;
    }
}
