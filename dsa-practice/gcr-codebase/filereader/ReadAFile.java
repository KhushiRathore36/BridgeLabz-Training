package FileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            FileReader fr = new FileReader("input.txt"); 
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
