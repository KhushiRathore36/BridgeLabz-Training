package OPPSProblem;

public class PalindromeChecker {
	String text;

    
    PalindromeChecker(String text) {
        this.text = text;
    }

    
    boolean isPalindrome() {
        
        String cleanText = text.replace(" ", "").toLowerCase();

        int start = 0;
        int end = cleanText.length() - 1;

        while (start < end) {
            if (cleanText.charAt(start) != cleanText.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    void display() {
        if (isPalindrome()) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeChecker p1 =new PalindromeChecker("A man a plan a canal Panama");
		p1.display();
	}

}
