class Solution {
    public String solution(String s) {
        String answer = "";
        String[] ans = s.split("");
        
        int idx = 0;
        for(int i = 0; i < s.length(); i++){
            if(ans[i].equals(" ")){
                answer += ans[i];
                idx = 0;
            }else if(idx % 2 == 0){
                answer += ans[i].toUpperCase();
                idx++;
            }else if(idx % 2 == 1){
                answer += ans[i].toLowerCase();  
                idx++;
            }      
        }
        return answer;
    }
}