package Methods;
import java.util.*;
public class Collinear {

	public static boolean collinearBySlope(
            int x1, int y1,
            int x2, int y2,
            int x3, int y3) {

        return (y2 - y1) * (x3 - x2) ==(y3 - y2) * (x2 - x1);
    }

    
    public static boolean collinearByArea(
            int x1, int y1,
            int x2, int y2,
            int x3, int y3) {

        double area = 0.5 * (
                x1 * (y2 - y3) +
                x2 * (y3 - y1) +
                x3 * (y1 - y2)
        );

        return area == 0;
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        boolean slopeResult = collinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaResult = collinearByArea(x1, y1, x2, y2, x3, y3);

       
        if(slopeResult) {
        	System.out.println("Collinear");
        }
        else {
        	System.out.println("Not Collinear");
        }

        
        if(areaResult) {
        	System.out.println("Collinear");
        }
        else {
        	System.out.println("Not Collinear");
        }

        
    }


}
