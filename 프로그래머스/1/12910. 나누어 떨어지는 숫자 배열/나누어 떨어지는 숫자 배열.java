import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> lst = new ArrayList<Integer>();
        
        for(int each: arr){
            if(each% divisor == 0){
                lst.add(each);
            }
        }
        Collections.sort(lst);
        
        
        if(lst.size()>0){
            int[] answer = new int[lst.size()];
            for(int i = 0; i<lst.size(); i++){
            answer[i] = lst.get(i);
            
            }return answer;
        }else{
            int[] answer = {-1};
            return answer;
        }
                
    }
}