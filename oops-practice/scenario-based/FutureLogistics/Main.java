package FutureLogistics;
import java.util.*;
public class Main {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Utility util = new Utility();

        System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();

        String transportId = input.split(":")[0];

        if (!util.validateTransportId(transportId))
            return;

        GoodsTransport obj = util.parseDetails(input);

        String type = util.findObjectType(obj);

        System.out.println("\nTransporter id : " + obj.getTransportId());
        System.out.println("Date of transport : " + obj.getTransportDate());
        System.out.println("Rating of the transport : " + obj.getTransportRating());

        if (type.equals("BrickTransport")) {
            BrickTransport bt = (BrickTransport) obj;
            System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
            System.out.println("Brick price : " + bt.getBrickPrice());
        } else {
            TimberTransport tt = (TimberTransport) obj;
            System.out.println("Type of the timber : " + tt.getTimberType());
            System.out.println("Timber price per kilo : " + tt.getTimberPrice());
        }

        System.out.println("Vehicle for transport : " + obj.vehicleSelection());
        System.out.println("Total charge : " + obj.calculateTotalCharge());

        sc.close();
    }
}
