package ScenarioBased;
import java.util.*;
public class LineComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        System.out.println("write the (x1, y1) co-ordinates of line1: ");
        int line_x1=sc.nextInt();
        int line_y1=sc.nextInt();
        System.out.println("write the (x2, y2) co-ordinates of line1: ");
        int line_x2=sc.nextInt();
        int line_y2=sc.nextInt();
        System.out.println("write the (x1, y1) co-ordinates of line2: ");
        int line2_x1=sc.nextInt();
        int line2_y1=sc.nextInt();
        System.out.println("write the (x2, y2) co-ordinates of line2: ");
        int line2_x2=sc.nextInt();
        int line2_y2=sc.nextInt();
        // use case-1 calculate its length
        int line1_length=calculateLength(line_x1,line_y1,line_x2,line_y2);
        int line2_length=calculateLength(line2_x1,line2_y1,line2_x2,line2_y2);
        System.out.println("the length of the line1 is: "+line1_length);
        System.out.println("the length of the line2 is: "+line2_length);	
        //use case-2 check the equality
        if(line1_length==line2_length) {
        	System.out.println("Both line1 and line2 are equal");
        }
        //use case-3 check if the line are not equal than it is greater or lesser than other line
        else if(line1_length>line2_length) {
        	System.out.println("Line1 is greater than line2");
        }
        else {
        	System.out.println("Line1 is lesser than line2");
        }
        
	}
	public static int calculateLength(int x1,int y1,int x2,int y2) {
		int length=(int)Math.sqrt((int)Math.pow(x2-x1,2)+(int)Math.pow(y2-y1,2));
		return length;
	}

}
