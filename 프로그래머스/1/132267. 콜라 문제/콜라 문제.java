class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int store = 0;

        while(n >= a){
            store = n % a;
            n = b * (n/a);
            answer += n;
            n += store;
        }
         
        return answer;
    }
}