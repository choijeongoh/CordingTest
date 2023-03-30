import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int ans = emergency.length;
        int[] s = Arrays.stream(emergency).sorted().toArray();
        for (int i = 0; i < answer.length; i++) {
            for (int c = 0; c < emergency.length; c++) {
                if(emergency[i] == s[c]){
                    answer[i] = ans - c;
                }
            }
            System.out.println(answer[i]);
        }

        return answer;
    }
}