package day1.num32.other;


import java.util.Set;
import java.util.TreeSet;

//TreeSet을 사용한 풀이, Treeset은 add 할때 알아서 정렬을 해준고 해서 HashSet에서 바꾸고 sort안한거밖에 없다.

public class Solution32_2 {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> set = new TreeSet<>(); // 중복값을 알아서 제거해주는 set 중에서도 알아서 Hashset 자료구조 선택


        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) { // numbers 배열에 있는 수끼리 더할 수 있는 경우의 수를 모두 시도

                set.add(numbers[i] + numbers[j]);
            }
        }

        answer = new int[set.size()];// 배열 크기가 정해짐

        int index = 0;

        for (Integer set_val : set) { //set에 저장했던값을 answer배열로 옮김
            answer[index] = set_val;
            index++;
        }

        //정렬을 안해도 된다!

        return answer;
    }
}
