import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "RCJA";
        Map<String, Integer> score = new HashMap<>();
        score.put("R", 0);
        score.put("T", 0);
        score.put("C", 0);
        score.put("F", 0);
        score.put("J", 0);
        score.put("M", 0);
        score.put("A", 0);
        score.put("N", 0);
        
        for (int i = 0; i< survey.length; i++){
            // System.out.println(survey[i].charAt(0));
            if(choices[i]< 4){
                String key =Character.toString(survey[i].charAt(0));
                score.put(key, score.get(key) + (4-choices[i]));
            }
            if(choices[i]>4){
                String key =Character.toString(survey[i].charAt(1));
                score.put(key, score.get(key) + (choices[i]-4));
            }
        }
        
        
        // for (String keys : score.keySet())  {
        //     System.out.println(keys + ":"+ score.get(keys));
        // }
        
        if(score.get("T") > score.get("R")){
            answer = answer.replace("R","T");
        }
        if(score.get("F") > score.get("C")){
            answer = answer.replace("C","F");
        }
        if(score.get("M") > score.get("J")){
            answer = answer.replace("J","M");
        }
        if(score.get("N") > score.get("A")){
            answer = answer.replace("A","N");
        }
        return answer;
    }
}