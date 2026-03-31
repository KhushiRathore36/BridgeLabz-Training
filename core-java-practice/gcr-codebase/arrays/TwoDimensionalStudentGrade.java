package Arrays;
import java.util.*;
public class TwoDimensionalStudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

       
        int n = sc.nextInt();

        
        double[][] marks = new double[n][3]; 
        double[] percentage = new double[n];
        char[] grade = new char[n];

        
        for (int i = 0; i < n; i++) {
            

            for (int j = 0; j < 3; j++) {
                while (true) {
                    if (j == 0)
                        System.out.print("Physics: ");
                    else if (j == 1)
                        System.out.print("Chemistry: ");
                    else
                        System.out.print("Maths: ");

                    double value = sc.nextDouble();

                    if (value >= 0) {
                        marks[i][j] = value;
                        break;
                    } else {
                        System.out.println("Sorry,Marks cannot be negative");
                    }
                }
            }
        }

        
        for (int i = 0; i < n; i++) {
            double total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            percentage[i] = total / 3;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics   : " + marks[i][0]);
            System.out.println("Chemistry : " + marks[i][1]);
            System.out.println("Maths     : " + marks[i][2]);
            System.out.println("Percentage: " + String.format("%.2f", percentage[i]));
            System.out.println("Grade     : " + grade[i]);
            
        }
	}

}
