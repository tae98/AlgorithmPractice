class Solution {
    public int solution(int[] number) {
        int answer = 0;
       
        int x = number.length;
        for(int i = 0; i < number.length; i++){
            for(int j = i+1; j < number.length; j++){
                for(int k = j+1 ; k < number.length; k++){
                    if(number[i]+number[j]+number[k] == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}