class Solution {
    public static int solution(int hp) {
        int answer = 0;
        int rest = 0;
        for(int i = 5; i >= 1;  i--) {
            if (i == 5 || i == 3 || i == 1) {
                if (hp / i != 0 ) {
                    answer += (hp / i);
                    hp = hp % i;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}