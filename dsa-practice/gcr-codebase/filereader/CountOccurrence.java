package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            FileReader fr = new FileReader("input.txt"); 
            BufferedReader br = new BufferedReader(fr);

            String line;
            int count=0;
            while ((line = br.readLine()) != null) {
                String arr[]=line.split("\\s+");
                count+=arr.length;
            }
            System.out.println("count words in a file: "+count);
            br.close();
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
