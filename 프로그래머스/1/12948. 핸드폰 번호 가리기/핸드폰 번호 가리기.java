class Solution {
    public String solution(String phone_number) {
        String answer = phone_number;
        char[] charArray = answer.toCharArray();
        
        for(int i=0; i < answer.length() -4; i++){
            charArray[i]= '*';
        }
        
        answer = String.valueOf(charArray);
        return answer;
    }
}