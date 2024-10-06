import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] tmp = s.split(" ");
        List<Integer> nums = new ArrayList<>();
        
        for(String each: tmp){
            nums.add(Integer.valueOf(each));
        }
        
        Integer min = Collections.min(nums);
        Integer max = Collections.max(nums);
        
        answer = String.valueOf(min) + " " + String.valueOf(max);
        return answer;
    }
}