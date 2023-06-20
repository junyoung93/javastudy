package day1.num13.other;

// 미리 전체 날짜 수를 계산
class Solution13_2
{
    public String solution(int a, int b) {
        String answer = "";
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 월마다 일수를 배열에 저장
        int allDate = 0; // 1월 1일부터 a월 b일까지의 전체 일수

        for (int i = 0; i < a - 1; i++) {
            allDate += date[i]; // "전 월까지의 총 일수" 를 더해줌
        }

        allDate += (b - 1); // "a월의 일수"를 더해줌


        answer = day[allDate % 7]; // 나머지 연산을 통해서 0=> 금, 1=> 토 , 2=> 일 ... 이런식으로 매칭되게함.

        return answer;
    }
}