package Strings;
import java.util.*;
public class AgeOfStudent {

	public static int[] generateAges(int n) {

        int[] ages = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10;
        }

        return ages;
    }

    
    public static String[][] isVotingEligible(int[] ages) {

        String[][] ans = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            ans[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                ans[i][1] = "false";
            } else if (ages[i] >= 18) {
                ans[i][1] = "true";
            } else {
                ans[i][1] = "false";
            }
        }

        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] result = isVotingEligible(ages);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }

        
    }
   
    

   
    

}
