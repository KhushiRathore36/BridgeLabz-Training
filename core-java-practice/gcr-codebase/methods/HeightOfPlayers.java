package Methods;

public class HeightOfPlayers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println(sum);
        System.out.println( mean);
        System.out.println(shortest);
        System.out.println(tallest);
        
	}
	public static int findSum(int[] heights) {
        int sum = 0;

        for(int i=0;i<heights.length;i++) {
        	sum+=heights[i];
        }

        return sum;
    }
	public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }
	public static int findShortest(int[] heights) {
        int min = heights[0];

       for(int i=0;i<heights.length;i++) {
            if (heights[i] < min) {
                min = heights[i];
            }
        }

        return min;
    }
	public static int findTallest(int[] heights) {
        int max = heights[0];

        for (int i=0;i<heights.length;i++) {
            if (heights[i]> max) {
                max = heights[i];
            }
        }

        return max;
    }
}
