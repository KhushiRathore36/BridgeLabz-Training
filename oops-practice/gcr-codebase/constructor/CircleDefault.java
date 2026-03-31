package OPPSProblem;

import java.util.Scanner;

public class CircleDefault {
    int radius;
    CircleDefault(){
    	radius=4;
    }
    CircleDefault(int radius){
    	this.radius=radius;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int radi=sc.nextInt();
        CircleDefault circle=new CircleDefault();
        System.out.println(circle.radius);
        CircleDefault circle1=new CircleDefault(radi);
        System.out.println(circle1.radius);
	}

}
