class Solution {
        public static int[] solution(int[] numbers, int num1, int num2) {
            int[] answer = new int[num2-(num1-1)];
            int ans = 0;
            for(int i = 0; i < numbers.length; i++) {
                if (i >= num1 && i <= num2) {
                    answer[ans] = numbers[i];
                    ans++;
                }
            }return answer;
    }
}