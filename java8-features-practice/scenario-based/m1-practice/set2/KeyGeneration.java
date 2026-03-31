package set2;

import java.util.*;

public class KeyGeneration {

    static String validate(String s) {

        if (s == null || s.length() == 0)
            return "Invalid Input (empty string)";

        if (s.length() < 6)
            return "Invalid Input (length < 6)";

        if (s.contains(" "))
            return "Invalid Input (contains space)";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c))
                return "Invalid Input (contains digits)";
        }

        for (char c : s.toCharArray()) {
            if (!Character.isLetter(c))
                return "Invalid Input (contains special character)";
        }

        return "VALID";
    }

    static String generateKey(String s) {

        s = s.toLowerCase();

        StringBuilder temp = new StringBuilder();

        for (char c : s.toCharArray()) {
            if ((int) c % 2 != 0) {
                temp.append(c);
            }
        }

        temp.reverse();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < temp.length(); i++) {

            char c = temp.charAt(i);

            if (i % 2 == 0)
                result.append(Character.toUpperCase(c));
            else
                result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            String s = sc.nextLine();

            String status = validate(s);

            if (!status.equals("VALID")) {
                System.out.println(status);
            } else {
                String key = generateKey(s);
                System.out.println("The generated key is - " + key);
            }
        }
    }
}