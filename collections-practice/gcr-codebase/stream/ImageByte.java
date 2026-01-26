package Stream;
import java.io.*;
public class ImageByte {
	public static void main(String[] args) {
        String inputImage = "input.jpg";         
        String outputImage = "output_copy.jpg"; 

        try {
           
            FileInputStream fis = new FileInputStream(inputImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            fis.close();

            byte[] imageBytes = baos.toByteArray(); 
            baos.close();

            
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(outputImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            System.out.println("Image converted to byte array and restored successfully!");

           
            File f1 = new File(inputImage);
            File f2 = new File(outputImage);

            if (f1.length() == f2.length()) {
                System.out.println("Verification passed: Files are identical in size.");
            } else {
                System.out.println("Verification failed: Files differ in size.");
            }

        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
