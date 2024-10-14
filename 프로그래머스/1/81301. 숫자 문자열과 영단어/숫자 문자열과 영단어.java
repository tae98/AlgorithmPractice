import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String [] numlst = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
       
        for(int i =0; i < numlst.length; i++){
            if(s.contains(numlst[i])){
                s = s.replace(numlst[i],Integer.toString(i));
            }
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}