class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String stringNum = String.valueOf(x);
        int total = 0;
        
        for(int i =0; i<stringNum.length(); i++){
            total += Character.getNumericValue(stringNum.charAt(i));
        }
        
        if((x%total) == 0){
            answer = true;
        }
        
        return answer;
    }
}