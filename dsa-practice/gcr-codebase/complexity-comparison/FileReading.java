package Complexity;
import java.io.*;
public class FileReading {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String file100MB = "large_100MB.txt";
        String file500MB = "large_500MB.txt";

        System.out.println("Testing Large File Reading Efficiency");
        benchmark(file100MB);
        benchmark(file500MB);
	}
	public static void benchmark(String filePath) throws Exception {

        char[] buffer = new char[8192]; 
        int read;

        // FileReader Benchmark 
        long start = System.nanoTime();
        try (FileReader fr = new FileReader(filePath)) {
            while ((read = fr.read(buffer)) != -1) {}
        }
        long end = System.nanoTime();
        double fileReaderTime = (end - start) / 1_000_000.0;

        //  InputStreamReader Benchmark
        start = System.nanoTime();
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath))) {
            while ((read = isr.read(buffer)) != -1) {}
        }
        end = System.nanoTime();
        double inputStreamReaderTime = (end - start) / 1_000_000.0;

        System.out.println("File Size: " + new File(filePath).length() / (1024 * 1024) + "MB");
        System.out.println("FileReader Time: " + fileReaderTime + " ms");
        System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " ms");
        System.out.println("------------------------------------------");
    }

}
