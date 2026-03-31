package Inheritance;

public class OnlineRetailOrderManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order1 = new Order(1001, "2025-01-01");
        Order order2 = new ShippedOrder(1002, "2025-01-02", "TRK12345");
        Order order3 = new DeliveredOrder(1003, "2025-01-03", "TRK67890", "2025-01-06");

        System.out.println("Order 1 Status: " + order1.getOrderStatus());
        System.out.println("Order 2 Status: " + order2.getOrderStatus());
        System.out.println("Order 3 Status: " + order3.getOrderStatus());
	}

}
class Order {
    int orderId;
    String orderDate;

   
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

   
    String getOrderStatus() {
        return "Order Placed";
    }
}


class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped (Tracking No: " + trackingNumber + ")";
    }
}


class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}