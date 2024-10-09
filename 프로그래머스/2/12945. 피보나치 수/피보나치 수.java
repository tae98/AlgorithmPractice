import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> lst = new ArrayList<>();
        lst.add(0);
        lst.add(1);
        
        for(int i = 2; i <n; i++){
            int x = (lst.get(i-1) + lst.get(i-2))%1234567;
            lst.add(x);
        }
        
        answer = (lst.get(n-1) +lst.get(n-2))%1234567;
        return answer;
    }
}