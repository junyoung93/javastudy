package day1.num34.other;

import java.util.ArrayList;

////////////////// 배열 인덱스에 바로 나머지 연산을 진행해서 코드가 매우 간결해짐
//////////////score도 배열로 받아서 가독성이 좋아짐 => 배열로 선언하면 오히려 속도 측면에서는 더 느리다고한다.
/////////////

public class Solution34_2 {

    public int[] solution(int[] answer) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];


        for(int i=0; i<answer.length; i++) { // 인덱스 값 자체에 나머지 연산을 사용해서 간결하게 작성 함.
            if(answer[i] == a[i%a.length]) {score[0]++;}
            if(answer[i] == b[i%b.length]) {score[1]++;}
            if(answer[i] == c[i%c.length]) {score[2]++;}
        }

        int maxScore = Math.max(score[0], Math.max(score[1], score[2])); // 최댓값 찾음

        ArrayList<Integer> list = new ArrayList<>(); // 내 코드랑 동일한 부분이라 설명 있음
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}

        // 리스트를 스트림으로 변환하고
        // apToInt(i->i.intValue())를 호출하여 각 요소를 int 타입으로 매핑
        // 배열로 반환
        return list.stream().mapToInt(i->i.intValue()).toArray();

    }


}
