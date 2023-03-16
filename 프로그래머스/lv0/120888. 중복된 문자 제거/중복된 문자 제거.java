class Solution {
    public static String solution(String my_string) {
        String answer = "";
        String[] strings = my_string.split("");
        for(String s : strings) {
            if(my_string.contains(s)) {
                answer += s;
                my_string = my_string.replace(s, "");
            }
        }
        System.out.println(answer);
        return answer;
    }
}