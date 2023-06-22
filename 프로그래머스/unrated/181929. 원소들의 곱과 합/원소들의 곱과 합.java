class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 1;
        int b = 0;
        for(int s : num_list) {
            a *= s;
            b += s;
        }
        if (a < b*b) {
            answer = 1;
        } else if (a > b*b) {
            answer = 0;
        }
        return answer;
    }
}