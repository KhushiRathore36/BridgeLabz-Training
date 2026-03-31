package leetcodeBase;

public class VolumeOfEarth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int radius=6378;
        double volume_km=(4 * 3.14 * Math.pow(radius, 3)/3);
        double volume_miles=volume_km*1.6;
        System.out.println("The volume of earth in cubic kilometers is "+volume_km+" and cubic miles is "+volume_miles);
	}

}
