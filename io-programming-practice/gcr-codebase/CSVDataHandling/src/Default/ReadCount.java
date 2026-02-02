package Default;
import java.io.BufferedReader;
import java.io.FileReader;
public class ReadCount {
	public static void main(String[] args) {

        String filePath = "employees.csv";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

           
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                count++;
            }

            System.out.println("Total Records : " + count);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
