import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> lst = new ArrayList<>();
        int[] answer = new int[score.length];
        
        
        
        for(int i =0; i < score.length; i++){
            if(lst.size() < k){
                lst.add(score[i]);
                Collections.sort(lst, Collections.reverseOrder());
                answer[i] = lst.get(i);
            }else{
                lst.add(score[i]);
                Collections.sort(lst, Collections.reverseOrder());
                answer[i] = lst.get(k-1);
            }
        }
        return answer;
    }
}