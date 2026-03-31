package Methods;
import java.util.*;
public class TransposeMatrix {

	public static double[][] randomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10) + 1;
            }
        }
        return matrix;
    }

    
    public static void display(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(Math.round(value * 100.0) / 100.0 + "\t");
            }
            System.out.println();
        }
    }

    
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        double[][] result = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    
    public static double determinant(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    
    public static double[][] inverse(double[][] m) {
        double det = determinant(m);

        if (det == 0) {
            return null;
        }

        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;

        return inv;
    }

    
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) {
            return null;
        }

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

   
    public static void main(String[] args) {

        System.out.println("2x2 Matrix:");
        double[][] matrix2 = randomMatrix(2, 2);
        display(matrix2);

        System.out.println("\nTranspose:");
        display(transpose(matrix2));

        double det2 = determinant(matrix2);
        System.out.println("\nDeterminant (2x2): " + det2);

        System.out.println("\nInverse (2x2):");
        double[][] inv2 = inverse(matrix2);
        if (inv2 != null)
            display(inv2);
        else
            System.out.println("Inverse not possible");

        System.out.println("\n-----------------------------");

        System.out.println("\n3x3 Matrix:");
        double[][] matrix3 = randomMatrix(3, 3);
        display(matrix3);

        System.out.println("\nTranspose:");
        display(transpose(matrix3));

        double det3 = determinant3x3(matrix3);
        System.out.println("\nDeterminant (3x3): " + det3);

        System.out.println("\nInverse (3x3):");
        double[][] inv3 = inverse3x3(matrix3);
        if (inv3 != null)
            display(inv3);
        else
            System.out.println("Inverse not possible");
    }

}
