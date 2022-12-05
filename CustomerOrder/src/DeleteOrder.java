import java.util.ArrayList;

public class DeleteOrder {
    public static void delete(ArrayList<Object> orderResult , int orderNum){
        orderResult.remove(orderNum - 1);
        System.out.println("Cart Updated: " + orderResult);
    }
}
