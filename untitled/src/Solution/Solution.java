package Solution;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;

        int w = 0;
        int h = 0;

        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);

            for (int j = 0; j < 2; j++) {
                if( w < sizes[i][0]){
                    w = sizes[i][0];
                }
            }   if( h < sizes[i][1]){
                h = sizes[i][1];
            }
        }
        return w*h;
    }
}