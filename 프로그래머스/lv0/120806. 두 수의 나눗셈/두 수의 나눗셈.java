class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = (int) (((num1 * 1.0) / (num2 * 1.0)) * 1000.0);
        System.out.println(answer);
        return answer;
    }
}