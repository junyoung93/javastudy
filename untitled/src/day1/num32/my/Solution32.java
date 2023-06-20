package day1.num32.my;

import java.net.BindException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution32 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new HashSet<>(); // 중복값을 알아서 제거해주는 set 자료구조 선택


        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length ;j++){ // numbers 배열에 있는 수끼리 더할 수 있는 경우의 수를 모두 시도

                set.add(numbers[i] + numbers[j]);
            }
        }

        answer = new int[set.size()];// 배열 크기가 정해짐

        int index =0 ;

        for (Integer set_val : set) { //set에 저장했던값을 answer배열로 옮김
            answer[index] = set_val;
            index++;
        }

        Arrays.sort(answer); // 오름차순 정렬

        return answer;
    }
}
