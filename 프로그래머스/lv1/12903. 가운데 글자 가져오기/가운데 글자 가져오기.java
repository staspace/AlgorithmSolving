class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        
        char[] ans = new char[len];
        ans = s.toCharArray();
        
        if(s.length() % 2 == 1)
            answer += ans[len / 2];
        else{
            answer += ans[len / 2 - 1];
            answer += ans[len / 2];
        }
        return answer;
    }
}