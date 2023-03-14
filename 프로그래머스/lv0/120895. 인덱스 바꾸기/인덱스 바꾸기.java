class Solution {
    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] ans = my_string.split("");
        for(int i =0; i < ans.length; i++) {
            if(i == num1) {
                answer += ans[num2];
            }else if(i == num2) {
                answer += ans[num1];
            } else answer += ans[i];
        }
        System.out.println(answer);
        return answer;
    }
}