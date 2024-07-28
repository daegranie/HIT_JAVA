import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        Xoanoc(matrix, n);
        System.out.println("Ma trận xoắn ốc:");
        Inmatrix(matrix);
    }

    private static void Xoanoc(int[][] matrix, int n) {
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int value = 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = value++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = value++;
                }
                left++;
            }
        }
    }

    private static void Inmatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}