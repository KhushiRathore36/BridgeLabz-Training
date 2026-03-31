package leetcodeBase;

public class PenDistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int TotalPen=14;
        int remainingPen=14%3;
        int distribute_pen=TotalPen-remainingPen;
        int non_distribute_Pen=TotalPen-distribute_pen;
        System.out.println("The Pen Per Student is "+distribute_pen+ " and the remaining pen not distributed is "+non_distribute_Pen);
	}

}
