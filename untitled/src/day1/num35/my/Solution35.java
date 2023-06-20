package day1.num35.my;

import java.util.Arrays;

public class Solution35 {

    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        answer = new String[strings.length];
        //일단 사전순으로 정렬
        Arrays.sort(strings);
        // comparator를 람다식으로 구현, n번쨰 원소기준으로 오름차순으로 정렬
        Arrays.sort(strings, (o1, o2) -> o1.charAt(n) - o2.charAt(n) );

        for(int i=0; i<strings.length; i++){
            answer[i] = strings[i];
        }// String 배열에 복사

        return answer;
    }
}
