package day1.num31.other;

import java.util.ArrayList;

public class Solution31_3 {

    public int[] solution(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;// 이전 숫자를 의미함

        for(int num : arr) {
            if(preNum != num) // 이전 숫자랑 다르면 tempList에 추가
                tempList.add(num);
            preNum = num; // preNum 업데이트
        }

        int[] answer = new int[tempList.size()]; // 배열의 크기가 정해졌으니 크기 할당

        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue(); // List 요소를 배열에 그대로 복사
        }
        return answer;
    }
}
