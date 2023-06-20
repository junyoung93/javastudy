package day1.num28.other;

public class Solution28_3 {
    public boolean solution(int x) {
        //Integer.toString(x).chars() : string 으로 변환한것을 IntStream으로 변환
        //map(ch -> ch - '0').sum() : 아스키 값을 사용하여 '0' 뺴줌으로써 char to int 변환
        // 그리고 string을 char로 접근한 모든 인덱스 요소를 sum해줌
        int sum = Integer.toString(x).chars().map(ch -> ch - '0').sum();

        return x % sum == 0; // 히샤드인지 검증
    }
}
