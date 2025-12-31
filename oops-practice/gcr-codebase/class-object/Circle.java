package OPPSProblem;

public class Circle {
    int radius;
    Circle(int radius){
    	this.radius=radius;
    }
    public double calculateArea() {
    	double area=3.14*Math.pow(radius, 2);
    	return area;
    }
    public double calculateCircumference() {
    	double circum=2*3.14*radius;
    	return circum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle cir=new Circle(4);
        System.out.println(cir.calculateArea());
       System.out.println( cir.calculateCircumference());
	}

}
