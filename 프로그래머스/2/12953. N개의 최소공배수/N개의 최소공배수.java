class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        if(arr.length == 1) return arr[0];
        
        int tmp = gcd(arr[0],arr[1]);
        answer = (arr[0]*arr[1]) /tmp;
        
        if(arr.length >2){
            for(int i = 2; i < arr.length; i++){
                tmp = gcd(answer, arr[i]);
                answer = (answer * arr[i]) / tmp;
            }
        }
        
        return answer;
    }
    
    public static int gcd(int a, int b){
        int r = a % b;
        if(r == 0) return b;
        else return gcd(b, r);
    }
}