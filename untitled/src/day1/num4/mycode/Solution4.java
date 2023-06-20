package day1.num4.mycode;

class Solution4 {
    public long solution(int a, int b) {
        long answer = 0;

        int small=a;
        int big =b;
        if(a>b){
            big = a;
            small = b;
        }

        for(int i=small; i<=big; i++){
            answer +=i;
        }
        return answer;
    }
}