import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        List<Integer> lst = new ArrayList<>();
        for(int i = 0; i<food.length; i++){
            int tmp = food[i]/2;
            while(tmp>0){
                lst.add(i);
                tmp--;
            } 
        }
        for(Integer each: lst){
            answer+= Integer.toString(each);
        }
        
        Collections.sort(lst, Collections.reverseOrder());
        answer += 0;
        
        for(Integer each: lst){
            answer+= Integer.toString(each);
        }
        return answer;
    }
}