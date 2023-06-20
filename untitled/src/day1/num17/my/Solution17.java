package day1.num17.my;

class Solution17 {
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() ==4 || s.length() == 6){
            if(!s.matches("\\d+")){
                return false;
            }
        }

        return true;
    }
}