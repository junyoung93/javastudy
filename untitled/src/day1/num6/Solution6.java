package day1.num6;

class Solution6 {
    public int solution(int[] numbers) {
        int answer = -1;

        int sum=0;

        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }

        answer = 45-sum; //0~9 를 더하면 45

        return answer;
    }
}