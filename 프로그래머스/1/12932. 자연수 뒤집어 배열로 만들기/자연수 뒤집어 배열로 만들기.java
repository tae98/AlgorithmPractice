import java.util.*;
class Solution {
    public int[] solution(long n) {
        String tmp = Long.toString(n);
        int[] answer = new int[tmp.length()];
        int counter = 0;
        
        for(int i = (tmp.length() -1); i>=0; i--){
            int x = Character.getNumericValue(tmp.charAt(i));
            answer[counter] = x;
            counter++;
        }
        return answer;
    }
}