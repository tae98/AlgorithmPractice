import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> lst = new ArrayList<>();
        
        for(int i = 0; i<strings.length;i++){
            lst.add(strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(lst);
        
        for(int i =0; i<strings.length;i++){
            answer[i] = lst.get(i).substring(1, lst.get(i).length());
        }
        
        return answer;
    }
}