import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> lst = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++){
            if(n%i == 1){
                lst.add(i);
            }
        }
        answer = Collections.min(lst);
        return answer;
    }
}