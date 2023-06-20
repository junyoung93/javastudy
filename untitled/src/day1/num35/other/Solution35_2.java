package day1.num35.other;

import java.util.ArrayList;
import java.util.Collections;


////////////////// Comparator를 구현하지 않고도 신박한 방법으로 풀이
public class Solution35_2 {

    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]); //앞부분에 n번째 인덱스의 문자를 붙임
        }
        Collections.sort(arr);// 정렬

        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length()); //정렬할때 사용한 맨 앞부분 문자를 substring으로 제외해서 배열에 저장
        }
        return answer;
    }
}
