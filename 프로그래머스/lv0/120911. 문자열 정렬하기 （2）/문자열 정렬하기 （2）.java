import java.util.Arrays;
class Solution {
    public static String solution(String my_string) {
        String answer = "";
        String ans = my_string.toLowerCase();
        String[] strings = ans.split("");
        Arrays.sort(strings);
        for(String s : strings) {
            answer += s;
        }
        System.out.println(answer);
        return answer;
    }
}