package day1.num39.other;

// 미친 람다식 + stream
public class Solution39_2 {

    public String solution(String s, int _n) {

        //
        //1. Intstream올 변환
        return s.chars().map(c -> {
                    int n = _n % 26; // 26이 지나면 반복되므로

                    if (c >= 'a' && c <= 'z') { // a ~z 사이 즉 소문자이면
                        return 'a' + (c - 'a' + n) % 26; //c - 'a'는 소문자 'a'를 기준으로 한 상대적인 위치를 나타냄 !!!
                                                        // z이상 넘어가는걸 방지하기 위해서 (a를 일단 뺴주고 n을 더해준것)에 26으로 나눈 나머지를 구한 뒤 'a'를 다시 더함
                    }
                    else if (c >= 'A' && c <= 'Z') { // 대문자 버전이라 똑같음
                        return 'A' + (c - 'A' + n) % 26;
                    } else {
                        return c;
                    }
                }).mapToObj(c -> String.valueOf((char)c))//mapToObj()를 사용하여 각 아스키 코드 값을 문자열로 변환
                .reduce((a, b) -> a + b).orElse("");
         }

}
