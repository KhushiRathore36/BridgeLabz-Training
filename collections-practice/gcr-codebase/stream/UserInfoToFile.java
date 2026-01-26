package Stream;
import java.io.*;
public class UserInfoToFile {
	public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
           
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String favLang = br.readLine();

           
            FileWriter writer = new FileWriter("userdata.txt");

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + favLang + "\n");

            writer.close();
            System.out.println("Data saved successfully in userdata.txt!");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
