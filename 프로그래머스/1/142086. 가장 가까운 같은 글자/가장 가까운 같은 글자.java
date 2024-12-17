import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Stack<Character> tmp = new Stack<>();
        List<Integer> lst = new ArrayList<>();
        
        for(int i =0; i < s.length();i++){
                lst.add(tmp.search(s.charAt(i)));
                tmp.push(s.charAt(i));
        }
        
        for(int i =0; i< lst.size();i++){
            answer[i] = lst.get(i);
        }
        return answer;
    }
}