import java.util.Scanner;

class Solution {
    private static String answer = "";
    public String solution(String[] seoul) {
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break;
            } 
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(answer);
    }
}