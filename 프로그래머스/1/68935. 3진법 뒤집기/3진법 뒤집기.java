import java.util.*;

class Solution {
    public int solution(int n) {
        List <Integer> lst = new ArrayList<Integer>();
        int answer = 0; 
        
        while(n >= 1){
            int r = n %3;
            n = n /3;
            lst.add(r);
        }
        //3^3 3^2 3^1 3^0 
        System.out.print(lst);
        int counter = 0;
        
        for(int i = lst.size()-1; i >= 0; i--){
            answer += Math.pow(3, i) * lst.get(counter);
            counter ++;
        }
        
        return answer;
    }
}