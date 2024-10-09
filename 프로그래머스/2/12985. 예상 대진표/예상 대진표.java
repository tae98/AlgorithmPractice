class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        while(true){
            //짝수일시 다음 순위는 x/2 홀수일시 x/2 +1
            a = a / 2 + a % 2; 
            b = b / 2 + b % 2;
            answer++;
            if(a == b){
                break;
            }
        }

        return answer;
    }
}