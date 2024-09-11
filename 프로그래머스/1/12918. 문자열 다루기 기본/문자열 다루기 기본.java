class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        String[]tmp = s.split("");
        if(s.length()==4|| s.length() == 6){
            answer = true;
        }else{answer = false;}
        for(String each: tmp){
            try{
                int i = Integer.parseInt(each);
            }catch(NumberFormatException nfe){
                answer = false;
            }
        }
        return answer;
    }
}