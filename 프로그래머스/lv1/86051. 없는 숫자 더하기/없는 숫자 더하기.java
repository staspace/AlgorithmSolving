class Solution {
    public int solution(int[] numbers) {
        int result = 0;
        int[] num = {0,1,2,3,4,5,6,7,8,9};
        
        for(int i = 0; i<num.length; i++){
            for(int j = 0; j<numbers.length; j++){
                if(num[i] == numbers[j]){
                    num[i] = 0;
                }
            }
        }
        
        for(int i = 0; i<num.length; i++){
            result += num[i];
        }
        
        return result;
    }
}