package Extras;
import java.util.*;
public class ReplaceWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter new word: ");
        String newWord = sc.next();

        String ans= replaceWord(sentence, oldWord, newWord);

        
        System.out.println(ans);
	}
	public static String replaceWord(String sentence, String oldWord, String newWord) {

        String ans = "";
        String word = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                word = word + ch;
            } else {
                if (word.equals(oldWord)) {
                    ans = ans + newWord;
                } else {
                    ans = ans + word;
                }
                ans = ans + " ";
                word = "";
            }
        }

        
        if (word.equals(oldWord)) {
            ans= ans + newWord;
        } else {
            ans = ans + word;
        }

        return ans;
    }

}
