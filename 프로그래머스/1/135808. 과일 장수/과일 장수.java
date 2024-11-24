import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        int counter = 0;
        int min = k;
        //스택으로 집어넣음
        for(Integer each: score){
            stk.push(each);
        }
        //스택을 올림차순으로 정렬
        Collections.sort(stk);
        
        //스택이 빌때까지
        while(stk.size()>0){
            //마지막점수가 제일 높으니 tmp에저장
            int tmp = stk.pop();
            //min보다작을시 업데이트 후 카운터 증가
            if(tmp < min){
                min = tmp;
                counter++;
            }else{
                //min보다 작지않을시 카운터만증가
                counter++;
            }//카운터가 m이됬을시
            if(counter == m){
                //마지막 숫자가 min보다 작을시 min 업데이트후 answer에추가 counter초기화
                if(tmp < min){
                min = tmp;
                answer += min * m;
                counter=0;   
                }else{
                    //마지막 숫자가 min보다 크다면 기존 min을 이용해 answer에 추가 후 counter초기화
                    answer += min * m;
                    counter=0;}
        }
        }        
        return answer;
    }
}