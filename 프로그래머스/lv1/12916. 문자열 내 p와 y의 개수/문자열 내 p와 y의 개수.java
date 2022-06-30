class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String ans = s.toUpperCase();
        char[] ch = ans.toCharArray();
        
        int cntP = 0;
        int cntY = 0;
        for(int i = 0; i<ans.length(); i++){
            if(ch[i] == 'P') cntP++;
            if(ch[i] == 'Y') cntY++;
        }
        
        if(cntP != cntY){
            answer = false;
        }

        return answer;
    }
}