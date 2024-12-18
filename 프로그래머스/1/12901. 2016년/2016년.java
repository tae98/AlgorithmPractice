class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int month = a -1;
        int totalDay = b -1;
        
        for(int i = 1; i <= month; i++){
            if(i < 8){
                if(i == 2){
                    totalDay += 29;
                }else if(i % 2 != 0){
                    totalDay += 31;
                }else{
                    totalDay += 30;
                }
            }else{
                if(i % 2 !=0){
                    totalDay += 30;
                }else{
                    totalDay += 31;
                }
            }
        }
        int tmp = totalDay % 7;
        answer = day[tmp];
        return answer;
    }
}