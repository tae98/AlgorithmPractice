import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        List<Integer> lst= new ArrayList<>(set);
        Collections.sort(lst);
        
        for(int i = 0; i<answer.length; i++){
            answer[i] = lst.get(i);
        }
        
        return answer;
    }
}