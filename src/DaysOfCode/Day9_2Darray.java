package DaysOfCode;

import java.util.Scanner;


public class Day9_2Darray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int sum;
        int max = 0;
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
                sum = arr[i][j] + arr[i + 1][j] + arr[i + 1][j] +
                        arr[i + 1][j + 1] +
                        arr[i][j + 2] + arr[i][j + 2] + arr[i][j + 2];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
        scanner.close();
    }
}

