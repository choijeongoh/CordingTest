class Solution {
    public static int solution(String my_string) {
        int answer = 0;
        String ans = my_string.replaceAll("[^0-9]","");
        String[] a = ans.split("");
        for(String i : a) {
            int s = Integer.parseInt(i);
            answer += s;
        }
        System.out.println(answer);
        return answer;
    }
}