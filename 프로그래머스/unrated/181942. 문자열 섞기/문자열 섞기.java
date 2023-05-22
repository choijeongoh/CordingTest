class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] split = str1.split("");
        String[] split1 = str2.split("");
        int length = 0;
        for(String s : split) {
            answer += s;
            answer += split1[length];
            length++;
        }
        System.out.println(answer);
        return answer;
    }
}