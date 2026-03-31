package Default;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;
public class ValidateCSV {
	public static void main(String[] args) {

        String filePath = "employees_updated.csv";

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex = "^[0-9]{10}$";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            int rowNumber = 0;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {
                rowNumber++;

                String[] data = line.split(",");

                String email = data[2].trim();
                String phone = data[3].trim();

                boolean emailValid = emailPattern.matcher(email).matches();
                boolean phoneValid = phonePattern.matcher(phone).matches();

                if (!emailValid || !phoneValid) {
                    System.out.println("❌ Invalid Row " + rowNumber + ": " + line);

                    if (!emailValid) {
                        System.out.println("   → Invalid Email");
                    }
                    if (!phoneValid) {
                        System.out.println("   → Invalid Phone Number");
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
