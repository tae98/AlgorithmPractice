class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int [2];

        int area = brown + yellow;
        int tmp = brown/2; //12
        int width = tmp;
        
        for(int i =1; i<= tmp/2; i++){
            width -=1;//11
            int inner = width - 2;//9
            if(i * inner == yellow){
                answer[0] = inner+2;
                answer[1] = i+2;
                break;
            }
        }

        return answer;
    }
}