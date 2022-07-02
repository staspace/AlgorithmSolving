class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] ans = new char[s.length()];
        ans = s.toCharArray();
        
        if(s.length() == 4 || s.length() == 6){
            for(int i = 0; i < s.length(); i++){
                if(!(ans[i] >= '0' && ans[i] <= '9')){
                    answer = false;
                    break;
                }
            }  
        }else{
            answer = false;
        }
        return answer;
    }
}