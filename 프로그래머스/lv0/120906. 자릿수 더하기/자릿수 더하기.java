class Solution {
    public static int solution(int n) {
        String i = String.valueOf(n);
        String[] s = i.split("");
        int answer = 0;
        for(int v = 0; v < i.length(); v++) {
            int s1 = Integer.parseInt(s[v]);
            answer += s1;
        }
        System.out.println(answer);
        return answer;
    }
}