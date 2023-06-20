package day1.num24.mycode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Solution24 {
    class Solution {
        public long solution(long n) {
            long answer = 0;

            String str = Long.toString(n);

            String[] strings = str.split("");
            Arrays.sort(strings);

            long  mul=1; //long으로 선언한 이유 : n이 8000000000이라서 1000000000이 int에 담을 수 있는 값보다 큼
            for(int i=0 ;i< strings.length; i++){
                answer += Integer.parseInt(strings[i])*mul;
                mul *= 10;
            }



            return answer;

        }
    }

}
