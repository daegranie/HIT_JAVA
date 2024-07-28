import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mảng n: ");
        int n = scanner.nextInt();

        if (n <= 0 || n > 10000) {
            return;
        }

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" +i +"]= ");
            a[i] = scanner.nextInt();
            if (Math.abs(a[i]) > 100000000) {
                return;
            }
        }
        for (int i = 0; i < n; i++) {
            int temp ;
            if (i == 0) {
                temp = a[0];
            } else if (i == n - 1) {
                temp = a[n - 1];
            } else {
                temp = Math.abs(a[i + 1] - a[i - 1]);
            }
            a[i] += temp;
        }
        System.out.print("Mang sau khi bien doi:\n");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}