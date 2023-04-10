class Solution {
    public static int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        System.out.println(answer[0]);
        System.out.println(answer[1]);

        return answer;
    }
}