class Solution {
     public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String s : s1) {
            for(String a : s2) {
                if(s.equals(a)) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}