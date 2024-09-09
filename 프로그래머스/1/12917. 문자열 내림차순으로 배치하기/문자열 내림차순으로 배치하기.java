import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        
        Arrays.sort(str, Collections.reverseOrder());
        
        for(String each: str){
            answer += each;
        }
        return answer;
    }
}