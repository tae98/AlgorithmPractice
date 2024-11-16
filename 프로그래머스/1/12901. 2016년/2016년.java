class Solution {
    public String solution(int a, int b) {
        String answer = "";
         // 1.    2.   3.  4.    
        // 2.1  3.1  4.1  5.1  5.24
        // 31   60   91   120   144 % 7 만큼 리스트
        
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int month = a - 1;
        int totalDay = b-1;
        
        for(int i = 1; i <= month; i++){
            
            if(i < 8){
                if(i == 2){
                totalDay += 29;
                }else if(i % 2!= 0){
                    totalDay += 31;
                }else{
                    totalDay += 30;}
            }else{
                if(i % 2!= 0){
                    totalDay += 30;
                }else{
                    totalDay += 31;}
            }
        }
        int tmp = totalDay % 7;
        System.out.print(totalDay);
        answer = day[tmp];
        return answer;
    }
}