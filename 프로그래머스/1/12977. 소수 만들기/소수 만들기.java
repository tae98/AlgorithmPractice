import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> lst = new ArrayList<>();
        
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j< nums.length; j++)
                for(int k = j+1; k < nums.length; k++){
                    int tmp = nums[i]+nums[j]+nums[k];
                    lst.add(tmp);                        
                }
        }
        
        for(int each: lst){
            boolean flag = true;
            for(int i = 2; i < each/2; i++){
                if(each % i == 0){
                    flag = false;
                    continue;
                }
            }
            if(flag == true){
                answer++;
            }
        }        
        return answer;
    }
}