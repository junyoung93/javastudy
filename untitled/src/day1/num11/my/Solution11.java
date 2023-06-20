package day1.num11.my;

class Solution11 {
    public long[] solution(int x, int n) {
        long[] answer = {};

        answer = new long[n];

        long sum=0;

        for(int i=0 ; i<n; i++){
            sum +=x;
            answer[i] = (long)sum;
        }

        return answer;
    }
}