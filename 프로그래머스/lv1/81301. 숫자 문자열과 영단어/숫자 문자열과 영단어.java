class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] englishWord = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i = 0; i<10; i++){
            s = s.replace(englishWord[i], String.valueOf(i));
        }
        
        return answer = Integer.parseInt(s);
    }
}