import java.util.*;
class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        char[] ch = s.toCharArray();
        
        Arrays.sort(ch);
        
        String result = "";
        for(int i = s.length() - 1; i >= 0; i--){
            result += ch[i];
        }
        
        long answer = 0;
        answer = Long.parseLong(result);
        return answer;
    }
}