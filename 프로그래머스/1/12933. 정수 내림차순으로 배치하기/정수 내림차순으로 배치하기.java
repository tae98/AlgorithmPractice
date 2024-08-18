import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String numString = String.valueOf(n);
        List<Integer> lst = new ArrayList<Integer>();

        for(int i = 0; i < numString.length(); i++){
            lst.add(Character.getNumericValue(numString.charAt(i)));
        }
        Collections.sort(lst, Collections.reverseOrder());
        
        for(int num:lst){
            answer = answer*10 +num;
        }
        System.out.print(lst);
        return answer;
    }
}