import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String tmp = String.valueOf(n);
        int a;
        for(int i = 0; i< tmp.length(); i++){
            a = Character.getNumericValue(tmp.charAt(i));
            answer += a;

        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
}