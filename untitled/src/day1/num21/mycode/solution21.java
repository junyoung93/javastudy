package day1.num21.mycode;

class solution21 {
    public String solution(String s) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();

        int index_cnt =0 ;

        s = s.toLowerCase();

        for(int i=0 ;i<s.length(); i++){
            if(s.charAt(i) == ' '){
                stringBuilder.append(' ');
                index_cnt=0;
                continue;
            }

            if(index_cnt % 2 ==0){
                index_cnt++;
                stringBuilder.append((char)(s.charAt(i)-32) );

            }else{
                index_cnt++;
                stringBuilder.append(s.charAt(i));
            }

        }

        answer = stringBuilder.toString();

        return answer;
    }
}