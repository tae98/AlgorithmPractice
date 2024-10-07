class Solution {
    public int[] solution(String s) {
        
        int zeroCnt = 0;
        int cnt = 0;
        int tmp =0;
        while(!s.equals("1")){
            tmp=0;
            cnt++;
            for(int i =0; i<s.length();i++){
                if(s.charAt(i) == '0'){
                    zeroCnt++;
                }else{
                    tmp++;
                }
            }
            s = Integer.toBinaryString(tmp);
        }
       
        int[] answer = {cnt, zeroCnt};
        return answer;
    }
}