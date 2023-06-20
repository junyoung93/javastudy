package day1.num28.my;

public class Solution28 {

    public boolean solution(int x) {
        boolean answer = true;

        int temp_x = x; // x값을 바꿀것이므로 원래의 x값을 저장해둠

        int sum=0;
        while(x!=0){
            sum += x%10; // 1의자리 더해줌
            x /= 10; // 1의자리 날림
        }

        if(temp_x % sum  != 0 ){ // 히샤드면
            answer = false;
        }
        return answer;
    }
}
