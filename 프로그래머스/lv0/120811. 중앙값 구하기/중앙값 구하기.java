import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
int answer = 0;
        int[] sorted = Arrays.stream(array).sorted().toArray();
        answer = sorted[(sorted.length / 2)];
        return answer;
    }
}