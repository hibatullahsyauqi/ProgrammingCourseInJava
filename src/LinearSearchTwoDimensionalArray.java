import javax.naming.InsufficientResourcesException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LinearSearchTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the row size of the array: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the column size of the array: ");
        int col = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[row][];
        for (int i = 0; i < row; i++) {
            // int colSize = random.nextInt(col) + 1;
            matrix[i] = new int[col];
            for (int j = 0; j < col; j++) {
                matrix[i][j] = random.nextInt(-100, 100);
            }
        }
        System.out.printf("This is a %dx%d dimensional array:\n", row, col);
        System.out.println(Arrays.deepToString(matrix));
        System.out.print("Enter the element to be searched: ");
        int target = Integer.parseInt(sc.nextLine());
        int[] ans = Search(matrix, target);
        if (Arrays.toString(ans).equals("[-1, -1]")) {
            System.out.println("Element not found");
        } else {
            System.out.println(Arrays.toString(ans));
        }
        System.out.println("Matrix min value: " + Min(matrix));
        System.out.println("Min location is: " + Arrays.toString(Search(matrix, Min(matrix))));
        System.out.println("Matrix max value: " + Max(matrix));
        System.out.println("Max location is: " + Arrays.toString(Search(matrix, Max(matrix))));
    }

    static int[] Search(int[][] arrayTwoD, int target) {
        for (int row = 0; row < arrayTwoD.length; row++) {
            for (int col = 0; col < arrayTwoD[row].length; col++) {
                if (arrayTwoD[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int Max(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }

    static int Min(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;
                }
            }
        }
        return min;
    }
}
