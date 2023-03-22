class Solution {
    public static double solution(int[] numbers) {
        double answer = 0;
        for(double ans : numbers) {
            answer += ans;
        }
        answer = answer / numbers.length;
        System.out.println(answer);
        return answer;
    }
}