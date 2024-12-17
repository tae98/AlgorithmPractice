import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Stack<Character> tmp = new Stack<>();
        
        for(int i =0; i < s.length();i++){
                answer[i] = tmp.search(s.charAt(i));
                tmp.push(s.charAt(i));
        }
        
      
        return answer;
    }
}