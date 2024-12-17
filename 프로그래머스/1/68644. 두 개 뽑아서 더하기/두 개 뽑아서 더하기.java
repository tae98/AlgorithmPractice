import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Arrays.sort(numbers);
        
        
        Set<Integer> tmp = new HashSet<>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j< numbers.length; j++){
                tmp.add(numbers[i]+ numbers[j]);
            }
        }
        int[] answer = tmp.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}