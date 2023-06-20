package day1.num37.my;

public class Solution37 {
    public int solution(int[] nums) {
        int answer = -1;

        int num = 2;

        int[] arr = new int[3005];

//        for(int j=2; j*j<= 3000 ; j++){
//            if(arr[i]%j ==0 ){
//                check = true;
//                break;
//            }
//        }

        boolean check = false;

        int cnt=0;

        for(int i = 0 ; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){ // 모든 합의 경우의 수를 다 검사합니다.

                    int sum = nums[i] + nums[j] + nums[k];

                    for(int l=2; l*l<= sum ; l++){ // 소수를 판별
                                                   //2부터 1씩 늘려가면서 나눠주는데 l의 제곱값이 sum을 넘어가버리면 이후부터는 검사할 필요가 없음
                        if(sum%l ==0 ){//소수가 아니라면
                            check = true;
                            break;// true로 바꾸고 바로 정지
                        }
                    }

                    if(!check){ // 위에 if문에 안걸렸다는것이므로 소수임
                        cnt++;

                    }
                    check=false; // 초기화
                }
            }
        }


        answer = cnt;
        return answer;
    }
}
