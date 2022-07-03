import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int n = 0; n < commands.length; n++){
            for(int i = commands[n][0] - 1; i < commands[n][1]; i++){
                list.add(array[i]);
            }
            Collections.sort(list);
            answer[n] += list.get(commands[n][2] - 1); 
            list.clear();
        }
        return answer;
    }
}