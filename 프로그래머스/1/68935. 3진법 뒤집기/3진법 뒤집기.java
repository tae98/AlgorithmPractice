import java.util.*;

class Solution {
    public int solution(int n) {
        List <Integer> lst = new ArrayList<Integer>();
        int answer = 0; 
        
        while(n >= 1){
            int r = n % 3;
            lst.add(r);
            n = n /3;
        }
        //3^3 3^2 3^1 3^0 
        System.out.print(lst);
        int tmp = lst.size() -1;
        for(int each : lst){
            answer += each * Math.pow(3, tmp);
            tmp--;
        }
        
        return answer;
    }
}