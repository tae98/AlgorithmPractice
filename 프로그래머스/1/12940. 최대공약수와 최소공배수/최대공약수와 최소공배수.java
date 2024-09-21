class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {n,m};
        int min = Math.min(n, m);;
        int max =Math.max(n,m);
        
        
        
        
        while(min != 0){
            int r = max % min;
            max = min;
            min = r;
        }

        
        answer[0] = max;
        answer[1] = (n * m) / max;
    
        
        return answer;
    }
}