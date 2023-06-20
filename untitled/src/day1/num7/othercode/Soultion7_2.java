package day1.num7.othercode;

//삼항 연산자를 활용한 한줄풀이
class Solution7_2 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += absolutes[i] * (signs[i]? 1: -1); // signs의 ture false 여부에 따라 삼항연산자로 부호를 바로 곱할 수 있게 작성.
        return answer;
    }
}