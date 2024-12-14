import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
       
        Map<String, Integer> runMap = new HashMap<>();
        
        for(int i = 0; i < players.length; i++){
            runMap.put(players[i], i);
        }
        
        
        for(String each: callings){
            //불린선수
            int called = runMap.get(each);
            //앞선수
            String tmp = players[called -1];
            runMap.replace(tmp, called);
            players[called] = tmp;
            runMap.replace(each, called -1);
            players[called - 1] = each;

        }
        
//         for(int i = 0; i < players.length; i++){
            
//         }

        return players;
    }
}