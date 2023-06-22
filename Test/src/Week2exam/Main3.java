package Week2exam;

public class Main3 {
    public static void solution(int[][] arr1) {
        int x = arr1.length;
        int y = arr1[0].length;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                boolean up = true;

                if (i > 0 && arr1[i][j] <= arr1[i - 1][j]) {
                    up = false;
                }
                if (j > 0 && arr1[i][j] <= arr1[i][j - 1]) {
                    up = false;
                }
                if (i < x - 1 && arr1[i][j] <= arr1[i + 1][j]) {
                    up = false;
                }
                if (j < y - 1 && arr1[i][j] <= arr1[i][j + 1]) {
                    up = false;
                }

                if (up){
                    System.out.print("* ");
                }else {
                    System.out.print(arr1[i][j] + " ");
                }
//                System.out.print(up ? "* " : arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = {
                {7, 4, 6, 5, 9},
                {6, 1, 3, 4, 5},
                {4, 8, 5, 6, 9},
                {1, 3, 0, 6, 4},
                {6, 4, 8, 1, 7}
        };

        solution(arr1);
    }
}
