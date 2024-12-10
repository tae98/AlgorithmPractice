class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String target:babbling){
            if(target.contains("ayaaya")
              ||target.contains("yeye")
              ||target.contains("woowoo")
              ||target.contains("mama")){
                continue;
            }
            target = target.replace("aya", " ");
            target = target.replace("ye", " ");
            target = target.replace("woo", " ");
            target = target.replace("ma", " ");
            target = target.replace(" ", "");

            if(target.isEmpty()){
                answer+=1;
            }
        }
    
        return answer;
    }
}
