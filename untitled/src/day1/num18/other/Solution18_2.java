package day1.num18.other;

import java.util.Arrays;

public class Solution18_2 {
    public String solution(String[] seoul){
        //x에 김서방의 위치를 저장하세요.
        // 배열을 asList매서드를 사용해 List로 변한하고
        //indexOf() 매서드로 "kim"에 해당하는 인덱스를 추출
        int index = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 "+ index + "에 있다";
    }
}
