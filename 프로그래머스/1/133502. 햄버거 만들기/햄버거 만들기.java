import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> lst = new ArrayList<>();
        
        for(int each: ingredient){
            lst.add(each);
            
            while(lst.size()>=4){
                int n = lst.size();
                if(!(lst.get(n -1) == 1
                    && lst.get(n-2) == 3
                    && lst.get(n-3) == 2
                    && lst.get(n-4) == 1)) break;
               
                for(int j=0; j<4;j++){
                    lst.remove(lst.size()-1);
                }
                answer ++;
            }
        }
        
             
        return answer;
    }
}