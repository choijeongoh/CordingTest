class Solution {
      public static String solution(String my_string, int n) {

        String answer = "";
        String ans = "";
        String a = "";
        for(int i = 0; i < my_string.length(); i++) {
            for (int s = 0; s < n; s++) {
                a = String.valueOf(my_string.charAt(i));
                answer += a;
            }
        }System.out.println(answer);
        return answer;
    }
}