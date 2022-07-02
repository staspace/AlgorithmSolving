class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int tmp = x;
        int sum = 0;
        int val = 0;
        
        while(x > 0){
            val = x % 10;
            x /= 10;
            sum += val;
        }
        
        if(tmp % sum != 0){
            answer = false;
        }
        
        return answer;
    }
}