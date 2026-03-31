import java.util.*;
public class LexicalTwist {
	public static boolean isSingleWord(String s) {
        return !s.contains(" ");
    }

    public static boolean isReverse(String first, String second) {
        return new StringBuilder(first.toLowerCase()).reverse().toString()
                .equals(second.toLowerCase());
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String first = sc.nextLine().trim();

        if (!isSingleWord(first)) {
            System.out.println(first + " is an invalid word");
            return;
        }

        System.out.println("Enter the second word");
        String second = sc.nextLine().trim();

        if (!isSingleWord(second)) {
            System.out.println(second + " is an invalid word");
            return;
        }

        
        if (isReverse(first, second)) {

            
            String reversed = new StringBuilder(first).reverse().toString();

          
            reversed = reversed.toLowerCase();

            reversed = reversed.replaceAll("[aeiou]", "@");

            System.out.println(reversed);
        }

        else {

            String combined = (first + second).toUpperCase();

            int vowelCount = 0, consonantCount = 0;

            for (char c : combined.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (isVowel(c)) vowelCount++;
                    else consonantCount++;
                }
            }

           
            if (vowelCount > consonantCount) {
                
                LinkedHashSet<Character> vowels = new LinkedHashSet<>();
                for (char c : combined.toCharArray()) {
                    if (isVowel(c)) vowels.add(c);
                    if (vowels.size() == 2) break;
                }
                for (char c : vowels) System.out.print(c);
            }
            else if (consonantCount > vowelCount) {
               
                LinkedHashSet<Character> cons = new LinkedHashSet<>();
                for (char c : combined.toCharArray()) {
                    if (Character.isLetter(c) && !isVowel(c)) cons.add(c);
                    if (cons.size() == 2) break;
                }
                for (char c : cons) System.out.print(c);
            }
            else {
                System.out.println("Vowels and consonants are equal");
                return;
            }
        }
    }
}
