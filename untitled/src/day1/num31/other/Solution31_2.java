package day1.num31.other;

import java.util.ArrayList;
import java.util.List;
///////////////// List 자료구조로 풀어서 index 값에 접근을 쉽게 했다.

public class Solution31_2 {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]); // 0을 먼저 넣어준 이유 i-1 로 인덱스에 접근할때 음수가 나오는것을 방지하기 위해

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) //최근값이랑 다르면 list에 추가
                list.add(arr[i]);
        }

        int[] answer = new int[list.size()];// 배열의 크기가 정해졌으니 크기 할당

        for (int i = 0; i < list.size(); i++)
            answer[i] = list.get(i); // 배열에 그대로 복사

        return answer;
    }
}
