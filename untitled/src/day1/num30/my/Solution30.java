package day1.num30.my;

import java.util.Arrays;

public class Solution30 {
    public int solution(int[][] sizes) {
        int answer = 0;

        int len1 = sizes.length;


        // 풀이 방법:
        // 1.각각의 명함을 모두 정렬하고 더 긴 부분을 비교해서 제일 큰값을 찾는다.
        // 2. 이후에 더 짧은 쪽끼리 비교해서 가장 큰값을 또하나 찾는다.

        int x1=0;
        int x2=0;

        for(int i=0; i<len1; i++){
            Arrays.sort(sizes[i]);

            for(int j=0; j<2; j++){
                if(x1 < sizes[i][1]){ //더 긴게 나오면 업데이트
                    x1 = sizes[i][1];
                }//긴거중에 가장 긴거

                if(x2 < sizes[i][0]){//더 긴게 나오면 업데이트
                    x2 = sizes[i][0];
                }// 짧은거 중에 가장 긴거
            }
        }



        return x1*x2; //곱해서 출력
    }
}
