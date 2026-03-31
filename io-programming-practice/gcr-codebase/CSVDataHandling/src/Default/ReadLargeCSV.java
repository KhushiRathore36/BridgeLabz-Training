package Default;
import java.io.*;
import java.util.*;

public class ReadLargeCSV {
	private static final int CHUNK_SIZE = 100;

    public static void main(String[] args) {

        String filePath = "large_file.csv";
        int totalRecords = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            List<String> chunk = new ArrayList<>(CHUNK_SIZE);

            // header skip (optional)
            br.readLine();

            while ((line = br.readLine()) != null) {
                chunk.add(line);

                if (chunk.size() == CHUNK_SIZE) {
                    totalRecords += processChunk(chunk);
                    System.out.println("Processed records: " + totalRecords);
                    chunk.clear(); // memory free
                }
            }

            // remaining records (<100)
            if (!chunk.isEmpty()) {
                totalRecords += processChunk(chunk);
                System.out.println("Processed records: " + totalRecords);
            }

            System.out.println("✅ Total Records Processed: " + totalRecords);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Dummy processing method
    private static int processChunk(List<String> chunk) {
        // Yahan tum validation, DB insert, filtering kuch bhi kar sakti ho
        return chunk.size();
    }
}
