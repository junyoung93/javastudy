package day1.num12.my;

class Solution12 {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long sum=0;

        for(int i=1; i<=count; i++){
            sum += (long)price * i;
        }

//        System.out.println(sum);
//        System.out.println(money );

        if(sum - (long) money <= 0 ){
            return 0;
        }
        answer = sum - (long) money;

        return answer;
    }
}