package day1.num40.my;










public class Solution40{
    public String solution(String new_id) {
        String answer = "";

        //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        new_id = new_id.toLowerCase();

        StringBuilder stringBuilder = new StringBuilder();

        //2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        for(int i=0; i< new_id.length(); i++) {
            char id_index = new_id.charAt(i);

            if (
                    (id_index >= 'a' && id_index <= 'z') || // 소문자 알파벳이면
                    (id_index >= '0' && id_index <= '9') ||  // 숫자면
                    (id_index == '-' || id_index == '_' || id_index == '.') // -,_,.  셋중 하나면
            ){
                stringBuilder.append(id_index); // 추가!!
            }
        }
        new_id = stringBuilder.toString(); // new_id 업데이트


        stringBuilder = new StringBuilder(); // 스트링 빌더 초기화


        stringBuilder.append(new_id.charAt(0));

        //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        for(int i=1; i< new_id.length(); i++) {

            if(new_id.charAt(i-1) =='.'&& new_id.charAt(i) =='.'){ //이전이 .인데 지금도 .이면 continue 하고
                continue;
            }
            stringBuilder.append(new_id.charAt(i)); // 그게 아니라면 추가
        }

        new_id = stringBuilder.toString();

        //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if (new_id.length() > 0 && new_id.charAt(0) == '.') {
            new_id = new_id.substring(1);
        }
        if (new_id.length() > 0 && new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        //5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (new_id.isEmpty()) {
            new_id = "a";
        }


        //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            //만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
            if (new_id.charAt(new_id.length() - 1) == '.') { // 6단계를 반복하고 4단계에 걸리면 안되니까 다시한번 체크
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }



        //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        while (new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length() - 1);
        }

        answer = new_id;

        return answer;

    }
}
