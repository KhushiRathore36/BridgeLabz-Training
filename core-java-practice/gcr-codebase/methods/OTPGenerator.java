package Methods;

public class OTPGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] otps = generateOTP(10);

        

        boolean unique = isOTPsUnique(otps);

        if (unique) {
            System.out.println("unique.");
        } else {
            System.out.println("Duplicate found.");
        }
	}
	public static boolean isOTPsUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; 
                }
            }
        }

        return true; 
    }
	public static int[] generateOTP(int size) {
        int[] otps = new int[size];

        for (int i = 0; i < size; i++) {
            otps[i] = generateOTP();
        }

        return otps;
    }
	 public static int generateOTP() {
	        return (int) (Math.random() * 900000) + 100000;
	 }

}
