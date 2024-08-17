class Solution {
    public int solution(String s) {
        int answer = 0;
        int tmp;
        char fistCharacter = s.charAt(0);
        tmp = Integer.parseInt(s.substring(1, s.length()));
        
        if(fistCharacter=='-'){
            answer = -1 * tmp;
        }else if(fistCharacter == '+'){
            answer = tmp;
        }else{
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}