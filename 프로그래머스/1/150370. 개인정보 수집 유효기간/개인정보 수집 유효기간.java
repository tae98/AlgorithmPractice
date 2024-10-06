import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();
        List<Integer> expireList = new ArrayList<>();
        
        for(String each: terms){
            String[] tmp = each.split(" ");
            termMap.put(tmp[0], Integer.parseInt(tmp[1]));
        }
        
        String[] todayPart = today.split("\\.");
        int todayYear = Integer.parseInt(todayPart[0]);
        int todayMonth = Integer.parseInt(todayPart[1]);
        int todayDay = Integer.parseInt(todayPart[2]);
        
        for(int i = 0; i< privacies.length; i++){
            String[] info = privacies[i].split(" ");
            String[] date = info[0].split("\\.");
            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[2]);
            
            int finalYear = year;
            int finalMonth = month + termMap.get(info[1]);
            int finalDay = day;
            
            while (finalMonth > 12){
                finalYear+=1;
                finalMonth -=12;
            }
            if(finalYear < todayYear || (finalYear == todayYear && finalMonth<todayMonth) || (finalYear == todayYear && finalMonth == todayMonth && finalDay <= todayDay)){
                expireList.add(i+1);
            }
            
        }
        int[] answer = new int[expireList.size()];
        for(int i = 0; i < expireList.size(); i++){
            answer[i] = expireList.get(i);
        }
        return answer;
    }
}