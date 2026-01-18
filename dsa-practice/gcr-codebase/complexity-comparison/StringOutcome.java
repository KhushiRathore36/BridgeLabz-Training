package Complexity;

public class StringOutcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] sizes = {1000, 10000, 1_000_000};
        
        System.out.println("Operations\tString\t\tStringBuilder\tStringBuffer");

        for (int N : sizes) {

            String stringResult, sbResult, sbuffResult;

            // Test String (O(N^2)) 
            if (N > 10000) {
                stringResult = "Unfeasible";
            } else {
                long start = System.nanoTime();
                String s = "";
                for (int i = 0; i < N; i++) {
                    s += "a";
                }
                long end = System.nanoTime();
                stringResult = (end - start) / 1_000_000.0 + "ms";
            }

          
            long start = System.nanoTime();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sb.append("a");
            }
            long end = System.nanoTime();
            sbResult = (end - start) / 1_000_000.0 + "ms";

           
            start = System.nanoTime();
            StringBuffer sbuff = new StringBuffer();
            for (int i = 0; i < N; i++) {
                sbuff.append("a");
            }
            end = System.nanoTime();
            sbuffResult = (end - start) / 1_000_000.0 + "ms";

            System.out.println(N + "\t\t" + stringResult + "\t" + sbResult + "\t\t" + sbuffResult);
        }
	}

}
