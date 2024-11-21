import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Stack<String> card1Stack = new Stack<>();
        Stack<String> card2Stack = new Stack<>();
        boolean flag = true;
        
        //카드1 스택화
        for(int i = cards1.length -1; i>= 0; i--){
            card1Stack.push(cards1[i]);
        }
        
        //카드2 스택화
         for(int i = cards2.length -1; i>= 0; i--){
            card2Stack.push(cards2[i]);
        }
        

        
        for(int i = 0; i <goal.length; i++){
            //카드1 스택마지막이 goal의 단어랑 일치하고 스택이 비어있지않을시
            if(!card1Stack.isEmpty() && (goal[i].equals(card1Stack.peek()))){
                     card1Stack.pop();
                     continue;
                
            }//카드2 스택마지막이 goal의 단어랑 일치하고 스택이 비어있지않을시
            else if(!card2Stack.isEmpty() && goal[i].equals(card2Stack.peek())){
                    card2Stack.pop();
                    continue;}       
            else{
                flag = false;
                break;}
       }
        if(flag == true){
         answer = "Yes";
        }else{
         answer ="No";
     }
        
     return answer;

}
}

