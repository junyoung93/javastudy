package day1.num27.other;

public class Solution27_2 {

    public int solution(int num) {
        long n = (long)num;// num에 3을 곱하는 연산을 해야해서 너무 커지면 받지를 못함.-> long으로 형변환

        for(int i=0; i<500; i++){
            if(n==1) return i; // i가 0부터 시작하므로 for문을 들어오자 마자 i를 return 하는 방식이 가능해짐
            n = (n%2==0) ? n/2 : n*3+1; // 삼항연산자를 사용한 풀이
        }

        return -1;
    }
}
