package day1.num23.my;

public class Solution23 {

    class Solution {
        public int[] solution(long n) {
            int[] answer = {};

            String str_ans = Long.toString(n);

            int index=0;

            for(int i=str_ans.length()-1; i>=0; i--){
                answer[index] = str_ans.charAt(i) - '0';
                index++;
            }
            return answer;
        }
    }


}

