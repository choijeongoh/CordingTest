class Solution {
    public static int solution(int n, int k) {
        // n = 10, k = 3
        int answer = 0;
        int nPrice = 12000;
        int kPrice = 2000;

        if(n >= 10) {
            for (int i = 1; i <= n / 10; i++){
                answer = (nPrice * n) + (kPrice * k) - (kPrice * i);
            }
            System.out.println(answer);
        } else if(n < 10) {
            answer = (nPrice * n) + (kPrice * k);
        }
        return answer;
    }
}