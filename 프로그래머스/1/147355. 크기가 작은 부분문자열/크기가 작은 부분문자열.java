import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        List<Long> lst = new ArrayList<Long>();
        int len = p.length();
        long target = Long.valueOf(p);
        
        for(int i = 0; i <=t.length() - len ; i++){
            String tmp = t.substring(i, i+len);
            lst.add(Long.valueOf(tmp));
        }
        
        for(Long each: lst){
            if(each <= target){
                answer++;
            }
        }
        
        return answer;
    }
}