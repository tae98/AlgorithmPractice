class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int counter = 0;
        
        for(int i = left; left <= right; left++){
            counter =0;      
            
            for(int j = 1; j<= left; j++){
                
                if(left % j == 0){
                    counter ++;
                }else{
                    continue;
                }
            }
            if(counter%2 ==0){
                answer += left;
            }else{
                answer -=left;
            }
        }
        return answer;
    }
}