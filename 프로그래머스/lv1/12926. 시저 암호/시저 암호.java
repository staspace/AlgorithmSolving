class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] ans = s.toCharArray();
        
        for(int i = 0; i < s.length(); i++){
            if(ans[i] >= 'A' && ans[i] <= 'Z'){
                if(ans[i] + n > 'Z'){
                    ans[i] = (char) (ans[i] + n - 26);
                }
                else{
                    ans[i] += n;
                }
            }
            else if(ans[i] >= 'a' && ans[i] <= 'z'){
                if(ans[i] + n > 'z'){
                    ans[i] = (char) (ans[i] + n - 26);
                }
                else{
                    ans[i] += n;
                }
            }
            
            answer += ans[i];
        }
        
        return answer;
    }
}