import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String> > map = new HashMap<>();
        Map<String, Integer> intmap = new HashMap<>();
        
        for(int i = 0; i < id_list.length; i++){
            map.put(id_list[i], new HashSet<>());
            intmap.put(id_list[i],i);
        }
        
        for (int i = 0; i < report.length; i++){
            String[] tmp = report[i].split(" ");
            map.get(tmp[1]).add(tmp[0]);
        }
          
        for(int i = 0; i< id_list.length; i++){
            HashSet<String> set = map.get(id_list[i]);
            if(set.size()>=k){
                for(String each: set){
                    int index = intmap.get(each);
                    answer[index]++;
                }
            }
        }
      
        
      
        return answer;
    }
}