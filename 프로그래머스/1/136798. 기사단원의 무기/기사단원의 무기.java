import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <=number;i++){
            int counter = 0;
            
            for(int j = 1; j*j<=i; j++){
                if (j*j == i) 
                    counter++;
                else if(i % j == 0){
                    counter += 2;
                }
            }
            if(counter>limit){
                answer += power;
            }else{
                answer+=counter;
            }
        }
        
        return answer;
    }
}