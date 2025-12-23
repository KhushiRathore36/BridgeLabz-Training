package Strings;

public class NullPointerExceptionProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;

        try {
             System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            System.out.println("your string is null, so method call failed");
        }
	}

}
