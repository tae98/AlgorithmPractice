import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int[] newElements =new  int[elements.length*2];
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < newElements.length; i++){
            newElements[i] = elements[i % elements.length];
        }
        
        for(int i =0; i<elements.length; i++){
            
            for(int j =0; j < elements.length;j++){
                //j 부터 j + 1 까지 더한 숫자들 추가
                int sum = Arrays.stream(newElements, j, j+i).sum();
                set.add(sum);
            }
        }
        
        answer = set.size();
        
        return answer;
    }
}