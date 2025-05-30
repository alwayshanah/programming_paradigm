import java.util.Scanner;

public class MachineProblem1 {
    public static void main(String args[]) {

        Scanner key = new Scanner(System.in);

        int r = key.nextInt();
        int c = key.nextInt();

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = key.nextInt();
            }
        }

        if (r == 1 || r == 100 || c == 1 || c == 100) {
            System.out.println("Format Exception");
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 0)
                    System.out.print(".");
                else if (arr[i][j] == 1)
                    System.out.print("-");
            }
            System.out.println();
        }
    }
}
