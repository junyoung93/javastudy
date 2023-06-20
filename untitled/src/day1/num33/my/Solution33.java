package day1.num33.my;

import java.util.Arrays;

public class Solution33 {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};

        answer = new int[2];

        int[] lot = {6, 6, 5, 4, 3, 2, 1}; // 0개~6개 맞출때 각각 순위

        int zero_cnt= 0; // 지워진수의 갯수
        int cnt=0; // 정답의 갯수

        for(int i=0; i<lottos.length; i++){
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i]==0){
                    zero_cnt++; // 지워진  수의 개수
                    break;// 0이면 세기만 하고 바로 탈출
                }else {
                    if(lottos[i] == win_nums[j]){ // 정답번호를 포함 하고 있다면
                        cnt++; // cnt 증가
                    }
                }
            }
        }

        answer[0] = lot[cnt + zero_cnt]; // 최대는 지워진 부분이 다 맞는것
        answer[1] = lot[cnt]; // 최소는 지워진 부분이 다 틀리는것

        return answer;
    }

}
