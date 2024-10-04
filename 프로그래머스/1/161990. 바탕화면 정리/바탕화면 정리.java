import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
       
        int minX, minY;
        int maxX, maxY;
        
        minY = minX = Integer.MAX_VALUE;
        maxY = maxX = Integer.MIN_VALUE;
        
        // List<List<Integer>> tmplst = new ArrayList<>();
        // for(String each: wallpaper){
        //     System.out.println(each);
        // }
        
        for(int i = 0; i< wallpaper.length; i++){
            String tmp = wallpaper[i];
            for(int j = 0; j< tmp.length();j++){
                char x = tmp.charAt(j);
                if (x == '#'){
                    // List<Integer> numlst = new ArrayList<>();
                    // numlst.add(i);
                    // numlst.add(j);
                    // tmplst.add(numlst);
                    minX = Math.min(minX, j);
                    minY = Math.min(minY, i);
                    maxX = Math.max(maxX, j);
                    maxY = Math.max(maxY, i);
                }
            }
        }
        
        // System.out.println(tmplst);
        
        System.out.print(minY);
        System.out.print(minX);
        System.out.print(maxY+1);
        System.out.print(maxX+1);
        int[] answer = {minY, minX, maxY+1, maxX+1};
        return answer;
    }
}