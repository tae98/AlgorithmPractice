import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Stack<Character> stack = new Stack<>();
        List<Integer> numlst = new ArrayList<>();
        
        for(int i = 0; i<s.length();i++){
            if(!stack.contains(s.charAt(i))){
                stack.push(s.charAt(i));
                numlst.add(-1);
            }else{
                numlst.add(stack.search(s.charAt(i)));
                stack.push(s.charAt(i));
            }
        }
     
        for(int i = 0; i<answer.length;i++){
            answer[i] = numlst.get(i);
        }
        return answer;
    }
}