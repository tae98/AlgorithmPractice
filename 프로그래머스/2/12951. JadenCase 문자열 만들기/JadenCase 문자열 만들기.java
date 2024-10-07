class Solution {
    public String solution(String s) {
        String answer = "";
        String[] tmp = s.split(" ");
        
        for(int i = 0; i < tmp.length; i++){
            // 문자열의 길이가 0이라면 공백 추가         
            if(tmp[i].length() == 0){
                answer+= " ";
            }
            else{
                answer += tmp[i].substring(0,1).toUpperCase()+ tmp[i].substring(1).toLowerCase()+" ";
            }
        }
        // 입력 받은 문자열의 맨 마지막이 " " 라면 바로 answer 반환
        if(s.substring(s.length()-1, s.length()).equals(" ")) return answer;
        // 맨 마지막 " " 제거하고 answer 반환
        return answer.substring(0, answer.length()-1);
    }
}
        
