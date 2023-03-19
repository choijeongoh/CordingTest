public class Solution {
    public static String[] solution(String my_str, int n) {
        String[] answer = {};
        String[] strings = my_str.split("");
        String ans = "";
        int i = 0;

        int index = my_str.length() / n;
        if(my_str.length() % n == 0) {
            answer = new String[index];
        } else if (my_str.length() % n > 0) {
            answer = new String[index + 1];
        }

        for(int s = 0; s < strings.length; s++) {
            ans += strings[s];
            if(ans.length() == n){
                answer[i] = ans;
                ans = "";
                i++;
            } else if(my_str.length() - (s+1) == 0) {
                answer[i] = ans;
            }
        }


        for(int x = 0; x < answer.length; x++){
            System.out.println(answer[x]);
        }
        return answer;
    }
}