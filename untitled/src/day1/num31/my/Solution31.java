package day1.num31.my;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Solution31 {

    public int[] solution(int []arr) {
        int[] answer = {};

        Stack<Integer> st = new Stack<>(); // 스택으로 처리한 이유 : 맨위의 값, 즉 최근에 넣은 값이랑 비교를 해야해서 LIFO(LAST IN FIRST OUT) 구조인 스택을 택함

        for(int i=arr.length-1 ; i>=0; i--){ // 0부터 올라가면 먼저 뽑아야하는 값이 스택 맨 밑바닥에 있어서 인덱스를 큰곳에서 아래로 내림

            if(st.size()!=0){ // 0이 아닐때 조건을 걸어준이유 : 스택이 비어있을떄 peek 값에 접근하면 예외가 발생함
                if(st.peek() != arr[i])  st.push(arr[i]);
            }else{
                st.push(arr[i]);
            }
        }

        answer = new int[st.size()];// 배열의 크기가 정해졌으니 크기 할당


        int index =0 ;
        while(!st.empty()){ // 스택이 비어있을떄까지 answer 배열에 넣어줌
            answer[index] = st.pop();
            index++;
        }
        return answer;
    }
}
