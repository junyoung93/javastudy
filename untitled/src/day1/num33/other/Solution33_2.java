package day1.num33.other;

/////////////////////////////////HashMap을 사용한 풀이


import java.util.HashMap;
import java.util.Map;

public class Solution33_2 {

    public int[] solution(int[] lottos, int[] win_nums) {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        int zeroCount = 0;

        for(int lotto : lottos) {
            if(lotto == 0) { // 로또를 돌면서 0일떄는 zeroCount를 증가시킴
                zeroCount++;
                continue;
            }
            map.put(lotto, true); //0이 아니라면 map에 key값으로 매핑 시키고 value는 true로 지정합니다.
        }


        int sameCount = 0;
        for(int winNum : win_nums) {
            if(map.containsKey(winNum)) sameCount++; //key값을 가지고 있다면 즉, lottos의 번호가 정답이라면 sameCount를 증가시킴
        }

        // 가장 많을때 : 0이 모두 정답일때
        // 가장 적을때 : 0이 모두 틀릴때
        int maxRank = 7 - (sameCount + zeroCount);
        int minRank = 7 - sameCount;


        //0개 맞췄을때가 윗부분에서는 안들어가서 따로 처리해줌
        if(maxRank > 6) maxRank = 6;
        if(minRank > 6) minRank = 6;

        return new int[] {maxRank, minRank};
    }

}
