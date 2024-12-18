import java.util.*;
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int tmp = 0;
        //n = 처음 콜라병 a = 교환에필요한 콜라병 b = 교환해주는콜라병
        while(n >= a){
            if(n % a == 0){
                n = (n/a) * b;
                System.out.println("n % 2 : " + n);
                answer += n;
            }else{
                tmp = n % a;
                n = ((n/a) * b);
                
                answer += n;
                n = n + tmp;
                System.out.println("n !% 2 : " + n);
                System.out.println("tmp : " + tmp);
            }
         } //20 6(2) 2(2) 1(1)
        return answer;
    }
}