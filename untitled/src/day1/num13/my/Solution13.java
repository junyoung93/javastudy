package day1.num13.my;

class Solution13 {
    public String solution(int a, int b) {
        String answer = "";

        int prev_day_sum = 0;

        String []YO = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int yo_cnt =0;

        int x=1;
        int y=1;

        while(x !=a || y != b) {



            if(yo_cnt +1 <=6){
                yo_cnt +=1;
            }else{
                yo_cnt=0;
            }


            if(x==1 || x==3 || x==5 || x==7 || x==8 || x==10 || x==12) {
                if(y<31) {
                    y++;
                }else{
                    x++;
                    y=1;
                }
            }else if(x==4 || x==6 || x==11 || x==9 || x==11) {
                if(y<30) {
                    y++;
                }else{
                    x++;
                    y=1;
                }

            }else {
                if(y<29) {
                    y++;
                }else{
                    x++;
                    y=1;
                }
            }


        }

        answer = YO[yo_cnt];




        return answer;


    }
}