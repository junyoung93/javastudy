package Week2exam;

public class Main2 {
    public void solution(int star) {
        for (int i = 1; i <= star; i++) {
            for (int j = star - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int s = 1; s <= 2 * i - 1; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main method = new Main();
        int star = 9;
        method.solution(star);
    }
}
