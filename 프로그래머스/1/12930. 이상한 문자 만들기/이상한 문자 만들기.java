class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strlst = s.split("");
        
        int counter = 0;
        for(int i =0; i<strlst.length; i++){
            if(strlst[i].equals(" ")){
                counter =0;
            }else if(counter % 2 == 0){
                strlst[i] = strlst[i].toUpperCase();
                counter++;
            }else if(counter % 2 != 0){
                strlst[i] = strlst[i].toLowerCase();
                counter++;
            }
            answer += strlst[i];
        }
        return answer;
    }
}