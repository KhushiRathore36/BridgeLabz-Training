package Extras;
import java.util.*;
public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String vowels="aeiou";
        int countVowels=0;
        int countConsonants=0;
        for(int i=0;i<str.length();i++) {
        	if(vowels.contains(str.charAt(i)+"")) {
        		countVowels++;
        	}
        	else {
        		countConsonants++;
        	}
        }
        System.out.println("The number of vowels in the string is "+countVowels);
        System.out.println("The number of consonants in the string is "+countConsonants);
	}

}
