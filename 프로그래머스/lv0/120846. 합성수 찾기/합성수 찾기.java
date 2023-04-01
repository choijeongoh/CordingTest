class Solution {
      public static int solution(int n) {
        int answer = 0;
        for(int i = 0; i <= n; i++) {
            if (n <= 10) {
                if(i > 3) {
                    if (i % 2 == 0 || i % 3 == 0) {
                        answer++;
                    }
                }
            } else if (n > 10) {
                if(i > 10) {
                    if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                        answer ++;
                    }
                }
            }
        }
        if(n > 10) {
            answer = answer + 5;
        }
        System.out.println(answer);
        return answer;
    }
}