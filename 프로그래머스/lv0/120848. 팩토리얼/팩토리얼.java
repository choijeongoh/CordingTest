class Solution {
    public static int solution(int n) {
        int answer = 0;
        int ans = 1;
        for(int i = 1; i <= 10; i++) {
            ans = ans * i;
            if(ans <= n) {
                answer = i;
            }
        }
        System.out.println(answer);
        return answer;
    }
}