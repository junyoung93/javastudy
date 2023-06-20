package day1.num34.my;

import java.util.ArrayList;
import java.util.List;

public class Solution34 {
    public int[] solution(int[] answers) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        // 규칙성 파악


        //1,2,3번의 정답 수
        int cnt_1 = 0;
        int cnt_2 = 0;
        int cnt_3 = 0;


        //1,2,3번의 인덱스
        int index_1 = 0;
        int index_2 = 0;
        int index_3 = 0;

        for (int i = 0; i < answers.length; i++) {
            // 정답이면 cnt를 올려줌

            if (arr1[index_1] == answers[i]) {
                cnt_1++;
            }

            if (arr2[index_2] == answers[i]) {
                cnt_2++;
            }

            if (arr3[index_3] == answers[i]) {
                cnt_3++;
            }


            //나머지 연산으로 index를 초기화 => 각각 5,8,10이 넘어가는것을 방지하기 위함
            index_1 = (index_1 + 1) % arr1.length;
            index_2 = (index_2 + 1) % arr2.length;
            index_3 = (index_3 + 1) % arr3.length;
        }

        //가장 큰 값 추출
        int maxCount = Math.max(cnt_1, Math.max(cnt_2, cnt_3));

        List<Integer> resultList = new ArrayList<>();

        //각각이 가장 큰값이면 List에 추가해줌. 1,2,3 순으로 넣음으로 중복일때 순서도 해결

        if (cnt_1 == maxCount) {
            resultList.add(1);
        }
        if (cnt_2 == maxCount) {
            resultList.add(2);
        }
        if (cnt_3 == maxCount) {
            resultList.add(3);
        }

        int[] result = new int[resultList.size()]; // 배열의 크기가 확점됨

        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i); // 배열에 리스트값 복사
        }

        return result;
    }
}
