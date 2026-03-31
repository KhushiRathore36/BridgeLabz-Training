package Methods;
import java.util.*;
public class MatrixManipulation {

	 public static int[][] randomMatrix(int rows, int cols) {
	        int[][] matrix = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = (int)(Math.random() * 10); // 0 to 9
	            }
	        }
	        return matrix;
	    }

	    
	    public static int[][] add(int[][] A, int[][] B) {
	        int rows = A.length;
	        int cols = A[0].length;
	        int[][] result = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = A[i][j] + B[i][j];
	            }
	        }
	        return result;
	    }

	   
	    public static int[][] subtract(int[][] A, int[][] B) {
	        int rows = A.length;
	        int cols = A[0].length;
	        int[][] result = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = A[i][j] - B[i][j];
	            }
	        }
	        return result;
	    }

	    
	    public static int[][] multiply(int[][] A, int[][] B) {
	        int r1 = A.length;
	        int c1 = A[0].length;
	        int c2 = B[0].length;

	        int[][] result = new int[r1][c2];

	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c2; j++) {
	                for (int k = 0; k < c1; k++) {
	                    result[i][j] += A[i][k] * B[k][j];
	                }
	            }
	        }
	        return result;
	    }

	    
	    public static void display(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int value : row) {
	                System.out.print(value + "\t");
	            }
	            System.out.println();
	        }
	    }

	    
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        
	        int rows = sc.nextInt();
	        
	        int cols = sc.nextInt();

	        int[][] matrixA = randomMatrix(rows, cols);
	        int[][] matrixB = randomMatrix(rows, cols);

	        System.out.println("\nMatrix A:");
	        display(matrixA);

	        System.out.println("\nMatrix B:");
	        display(matrixB);

	        System.out.println("\nAddition of Matrices:");
	        display(add(matrixA, matrixB));

	        System.out.println("\nSubtraction of Matrices (A - B):");
	        display(subtract(matrixA, matrixB));

	        // For multiplication (cols of A must equal rows of B)
	        System.out.println("\nMatrix Multiplication:");

	        int[][] matrixC = randomMatrix(cols, rows);
	        display(multiply(matrixA, matrixC));

	        
	    }

}
