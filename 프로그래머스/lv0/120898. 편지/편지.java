class Solution {
    public int solution(String message) {
         int answer = 0;
        String[] m = message.split("");
        answer = m.length * 2;
        System.out.println(answer);
        return answer;
    }
}