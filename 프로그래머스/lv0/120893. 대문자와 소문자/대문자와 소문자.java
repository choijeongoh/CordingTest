class Solution {
    public static String solution(String my_string) {
        String answer = "";
        String[] string = my_string.toLowerCase().split("");
        String[] strings = my_string.split("");
        for(int i = 0; i < strings.length; i++) {
            if(string[i].equals(strings[i])) {
                answer += string[i].toUpperCase();
            } else if (!string[i].equals(strings[i])) {
                answer += string[i];
            }
        }
        System.out.println(answer);
        return answer;
    }
}