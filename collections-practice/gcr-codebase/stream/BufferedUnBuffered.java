package Stream;
import java.io.*;
public class BufferedUnBuffered {
	public static void main(String[] args) {
        File src = new File("largefile.bin");     
        File destUnbuffered = new File("copy_unbuffered.bin");
        File destBuffered = new File("copy_buffered.bin");

        if (!src.exists()) {
            System.out.println("Source file not found!");
            return;
        }

        long unbufferedTime = copyUnbuffered(src, destUnbuffered);
        long bufferedTime = copyBuffered(src, destBuffered);

        System.out.println("\n=== Performance Comparison ===");
        System.out.println("Unbuffered Streams: " + unbufferedTime + " ns");
        System.out.println("Buffered Streams:   " + bufferedTime + " ns");
        System.out.println("Buffered is " + ( (double) unbufferedTime / bufferedTime ) + "× faster (approx)");
    }

   
    public static long copyUnbuffered(File src, File dest) {
        long start = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

        } catch (IOException e) {
            System.out.println("Unbuffered copy error: " + e.getMessage());
        }
        return System.nanoTime() - start;
    }
    public static long copyBuffered(File src, File dest) {
        long start = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[4096]; // 4 KB chunk
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Buffered copy error: " + e.getMessage());
        }
        return System.nanoTime() - start;
    }
}
