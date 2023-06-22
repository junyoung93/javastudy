package Week2exam;

//import static java.lang.Integer.num;

public class Main {
    public String solution(int n) {
        int sum = 0;
        String s = String.valueOf(n);
        int[] num = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            num[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            sum += num[i];
        }

        String str = "";

        for (int i = 0; i < num.length; i++) {
            str += num[num.length - 1 - i] + "+";
        }

        str = str.substring(0, str.length() - 1); // 맨 마지막 "+" 제거

        return str + "=" + sum;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(method.solution(718253));
    }
}