import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        //리스트로 만들어서 향산된 for문으로 단어식이동
        // 이중for문으로 그단어의 length()의따라 uppercase
        String[] strlst = s.split("");
        // String[] upperlst = upper.split(" ");
        int counter = 0;
        
        
        
        for(int i =0; i<strlst.length; i++){
            if(strlst[i].equals(" ")){
                counter = 0;
                
            }else if(counter%2 == 0){    
                strlst[i] = strlst[i].toUpperCase();
                counter ++;
            
            }else if (counter%2 != 0){
                strlst[i] = strlst[i].toLowerCase();
                counter ++;
            }
            answer += strlst[i];
        }

        return answer;
    }
}