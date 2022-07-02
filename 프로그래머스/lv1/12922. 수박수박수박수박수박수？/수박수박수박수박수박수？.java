class Solution {
    public String solution(int n) {
        String answer = "";
        char[] ans = new char[n];
        
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                ans[i] = '수'; 
            }else{
                ans[i] = '박';
            }
            answer += ans[i];
        }
        return answer;
    }
}