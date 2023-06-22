public class Main {
    public String solution(int n) {
        int sum = 0;
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            digits[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            sum += digits[i];
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < digits.length; i++) {
            sb.append(digits[digits.length - 1 - i]).append("+");
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString() + "=" + sum;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(method.solution(718253));
    }
}
