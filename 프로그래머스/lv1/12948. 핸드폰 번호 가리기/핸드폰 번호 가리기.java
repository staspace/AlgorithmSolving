class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] ans = new char[phone_number.length()];
        
        for(int i = 0; i < phone_number.length(); i++){
            if(i < phone_number.length() - 4) ans[i] = '*';
            else ans[i] = phone_number.charAt(i);
        }
        
        for(int i = 0; i < phone_number.length(); i++){
            answer += ans[i];
        }
        
        return answer;
    }
}