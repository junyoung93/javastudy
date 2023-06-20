package day1.num20.othercode;


/////// map 을 사용한 풀이 ///////////////
////// 



import java.util.*;
class Solution20_2 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Long> participantMap = new HashMap<>();

        // 참가자의 이름별 명단을 맵에 담음
        // map.get() : map에 지정된 키에 해당하는 값을 반환
        //map.put(p, map.get(p) + 1); put 메서드를 통해서 중복된 사람의 경우 1씩 증가하는 값을 넣어줍니다.
        for (String p:participant)  {
            if(participantMap.get(p) != null){
                participantMap.put(p, participantMap.get(p) + 1L);
            }else{
                participantMap.put(p,1L);
            }
        }

        for(String name : completion) {

            Long value = participantMap.get(name) - 1L;
            //completion 배열을 순회하면서 각 이름의 등장 횟수를 participantMap에서 가져와서 1을 감소시킵니다.


            if(value == 0L) {//만약 횟수가 0이 되면 participantMap에서 해당 이름을 제거하고, 그렇지 않은 경우 감소된 횟수를 다시 participantMap에 저장합니다.
                participantMap.remove(name);
            } else {//모든 완주자를 처리한 후에는 participantMap의 키 집합에서 첫 번째 키를 가져와서 반환합니다.
                participantMap.put(name, value);
            }

        }

        return participantMap.keySet().iterator().next();
    }
}