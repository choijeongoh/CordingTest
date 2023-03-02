class Solution {
    public int solution(int order) {
          int answer = 0;
        String s = String.valueOf(order);
        for(int i = 0; i < s.length(); i++) {
            char ans = s.charAt(i);
            if(ans == '3' || ans == '6' || ans == '9') {
             answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }
}