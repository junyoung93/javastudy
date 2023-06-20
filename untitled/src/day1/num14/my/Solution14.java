package day1.num14.my;

import java.util.Arrays;

class Solution14 {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0) cnt++;
        }

        if(cnt == 0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[cnt];

        int index =0 ;

        for(int i = 0; i < arr.length; i++) if(arr[i] % divisor == 0) answer[index++] = arr[i];


        Arrays.sort(answer);

        return answer;
    }
}
