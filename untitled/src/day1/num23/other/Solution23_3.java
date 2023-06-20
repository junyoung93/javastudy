package day1.num23.other;

public class Solution23_3 {
    class Solution {
        public int[] solution(long n) {
            int[] answer = {};

            String str_ans = Long.toString(n);

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str_ans).reverse();

            answer = new int[stringBuilder.length()];

            int index=0;

            for(int i=0; i<stringBuilder.length(); i++){
                answer[index] = stringBuilder.charAt(i)-'0';
                index++;
            }
            return answer;
        }
    }
}
