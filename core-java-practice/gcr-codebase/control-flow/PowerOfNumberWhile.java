package leetcodeBase;

import java.util.Scanner;

public class PowerOfNumberWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        if (number <= 0 || power < 0) {
            System.out.println("negative number");
        } else {

        	int result = 1;
            int counter = 0;

            
            while (counter < power) {
                result = result * number;
                counter++;
            }

            
            System.out.println(result);
        }
       
	}

}
