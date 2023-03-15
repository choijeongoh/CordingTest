class Solution {
    public static int solution(int[] sides) {
        int answer = 0;
        int ans = 0;
        int a = 0;
        for (int i = 0; i < sides.length; i++) {
            if(ans < sides[i]) {
                ans = sides[i];
            }
        }
        for(int index = 0; index < sides.length; index++) {
            a += sides[index];
            if (ans >= a - ans) {
                answer = 2;
            } else if (ans < a - ans) {
                answer = 1;
            }
        }
        System.out.println(answer);
        return answer;
    }
}