package day1.num18.my;

class Solution18 {
    public String solution(String[] seoul) {
        String answer = "";

        int index=0;

        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                index=i;
                break;

            }
        }

        return "김서방은 " + index + "에 있다" ;
    }
}
