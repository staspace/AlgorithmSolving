import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        int checkNum = 0;
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                checkNum = numbers[i] + numbers[j];
        
                if(list.contains(checkNum)) continue;
                else list.add(checkNum);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        
        Arrays.sort(answer);
        return answer;
    }
}