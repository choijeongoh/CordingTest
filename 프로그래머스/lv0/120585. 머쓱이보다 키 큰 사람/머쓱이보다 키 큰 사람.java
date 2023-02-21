class Solution {
    public static int solution(int[] array, int height) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > height) {
                answer++;
            } else if (array[i] < height) {
            }
        }
        System.out.println(answer);
        return answer;
    }
}