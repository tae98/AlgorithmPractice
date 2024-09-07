class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int [] tmp = new int [a.length];
        
        for(int i = 0; i<a.length;i++){
            tmp[i] = a[i] * b[i];
        }
        
        for(int each : tmp){
            answer += each;
        }
        
        return answer;
    }
}