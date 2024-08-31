import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[arr.length-1];
        int tmp = arr[0];
        
        
        for(int each : arr){
            if(each<tmp){
                tmp = each;
            }
        }
        
        int counter =0;
        
        for(int i = 0; i< arr.length; i++){
            if(arr[i]==tmp){
                continue;
            }else{
                answer[counter] = arr[i];
                counter++;
            }
        }

        
        return answer;
    }
}