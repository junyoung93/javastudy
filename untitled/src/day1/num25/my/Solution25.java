package day1.num25.my;

public class Solution25 {
    public long solution(long n) {
        long answer = 0;

        if(Math.sqrt(n) == (long)(Math.sqrt(n)) ){ // Math.sqrt 매서드로 제곱근을 비교함,
                                                   // (long)으로 형변환을 했는데도 같다는 말은 소수점이 없는 정수였음을 의미함
            answer = (long)(Math.sqrt(n)+1) * (long)(Math.sqrt(n)+1); // 1더해서 제곱
        }else{
            answer = -1; // 정수 아니면 -1
        }

        return answer;
    }
}
