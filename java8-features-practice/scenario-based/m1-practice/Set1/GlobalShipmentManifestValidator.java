package Set1;
import java.util.*;
import java.util.regex.*;
import java.time.*;

public class GlobalShipmentManifestValidator {

	 static boolean validateCode(String code) {
	        if (!code.matches("SHIP-[1-9][0-9]{5}"))
	            return false;

	        String digits = code.substring(5);

	        int count = 1;
	        for (int i = 1; i < digits.length(); i++) {
	            if (digits.charAt(i) == digits.charAt(i - 1)) {
	                count++;
	                if (count > 3)
	                    return false;
	            } else {
	                count = 1;
	            }
	        }
	        return true;
	    }

	    static boolean validateDate(String date) {
	        if (!date.matches("20\\d{2}-\\d{2}-\\d{2}"))
	            return false;

	        try {
	            LocalDate d = LocalDate.parse(date);
	            return d.getYear() >= 2000 && d.getYear() <= 2099;
	        } catch (Exception e) {
	            return false;
	        }
	    }

	    static boolean validateMode(String mode) {
	        Set<String> modes = new HashSet<>(Arrays.asList(
	                "AIR", "SEA", "ROAD", "RAIL", "EXPRESS", "FREIGHT"
	        ));
	        return modes.contains(mode);
	    }

	    static boolean validateWeight(String weight) {

	        if (!weight.matches("(0|[1-9]\\d*)(\\.\\d{1,2})?"))
	            return false;

	        double w = Double.parseDouble(weight);
	        return w > 0 && w <= 999999.99;
	    }

	    static boolean validateStatus(String status) {
	        Set<String> statusSet = new HashSet<>(Arrays.asList(
	                "DELIVERED", "CANCELLED", "IN_TRANSIT"
	        ));
	        return statusSet.contains(status);
	    }

	    static boolean validateRecord(String record) {

	        String[] parts = record.split("\\|");
	        if (parts.length != 5)
	            return false;

	        return validateCode(parts[0]) &&
	                validateDate(parts[1]) &&
	                validateMode(parts[2]) &&
	                validateWeight(parts[3]) &&
	                validateStatus(parts[4]);
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int n = Integer.parseInt(sc.nextLine());

	        for (int i = 0; i < n; i++) {

	            String record = sc.nextLine();

	            if (validateRecord(record))
	                System.out.println("COMPLIANT RECORD");
	            else
	                System.out.println("NON-COMPLIANT RECORD");
	        }
	    }
}
