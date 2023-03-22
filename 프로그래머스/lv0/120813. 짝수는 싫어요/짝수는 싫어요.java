class Solution {
    public int[] solution(int n) {
          int[] answer = {};
        int i = 0;
        if(n % 2 == 0) {
            answer = new int[n / 2];
        }else answer = new int[(n / 2) + 1];

            for (int ans = 1; ans <= n; ans++) {
                if (ans % 2 != 0) {
                        answer[i] = ans;
                    i++;
                }
            }return answer;
    }
}