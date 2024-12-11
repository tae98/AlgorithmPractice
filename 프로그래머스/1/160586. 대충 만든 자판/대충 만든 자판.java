import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        
        for (String each:keymap){
            for(int i =0; i<each.length();i++){
                char c = each.charAt(i);
                //key와 맵핑된 value값을 반환하고 없으면 defaultValue값을 반환합니다.
                int val = map.getOrDefault(c, i+1);
                //put(K key, V value) : key와 value를 저장합니다. 
                map.put(c, Math.min(val, i+1));
            }
        }
        
        for(int i = 0; i<targets.length;i++){
            for(int j = 0; j<targets[i].length(); j++){
                char c = targets[i].charAt(j);
                if(map.containsKey(c)){
                    // get(Object key) : key와 맵핑된 value값을 반환합니다
                    answer[i] += map.get(c);
                }else{
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}