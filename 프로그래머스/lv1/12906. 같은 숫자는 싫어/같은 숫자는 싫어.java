import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int val = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == val) continue;
            else{
                list.add(arr[i]);
                val = arr[i];
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}