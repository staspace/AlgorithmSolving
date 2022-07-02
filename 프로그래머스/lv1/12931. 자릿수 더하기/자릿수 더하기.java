import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int val = 0;
        
        while(n > 0){
            val = n % 10;
            n /= 10;
            answer += val ;
        }

        return answer;
    }
}