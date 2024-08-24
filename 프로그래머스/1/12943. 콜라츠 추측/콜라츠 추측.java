class Solution {
    public int solution(int num) {
        int answer = 0;
        long longNum = num;
        
        while(longNum > 1){
            if(longNum % 2 == 0){
                longNum = longNum /2;
                answer++;
            }else{
                longNum = longNum * 3 + 1;
                answer++;
            }
        }
        
        if(answer >= 500){
            answer = -1;
        }
        
        return answer;
    }
}
