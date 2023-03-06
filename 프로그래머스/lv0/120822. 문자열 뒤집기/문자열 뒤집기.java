class Solution {
    public static String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char ans = my_string.charAt(my_string.length()-1-i);
            answer += ans;
        }
        System.out.println(answer);
        return answer;
    }
}