package leetcodeBase;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        float number1=sc.nextFloat();
        float number2=sc.nextFloat();
        float add=number1+number2;
        float sub=0.0f;
        if(number1>number2) {
        	sub=number1-number2;
        }
        else {
        	sub=number2-number1;
        }
        float multiply=number1*number2;
        double division=number1/number2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and"+number2+" is"+ add+", "+sub+", "+multiply+" ,"+division);
	}

}
