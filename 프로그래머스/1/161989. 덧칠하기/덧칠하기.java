import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int painted = 0;
        for(int each: section){
            if(each > painted){
                painted = each + m -1;
                answer++;
            }
        }
        return answer;
    }
}