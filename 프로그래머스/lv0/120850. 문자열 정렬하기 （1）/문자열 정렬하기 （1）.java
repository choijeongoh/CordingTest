import java.util.Arrays;

import static java.util.Arrays.stream;

public class Solution {
    public static int[] solution(String my_string) {
        String ints = "1234567890";
        String[] strings = my_string.split("");
        int index = 0;
        int dex = 0;
        for(int i = 0; i < strings.length; i++) {
            if(ints.contains(strings[i])){
                index++;
            }
        }
        int[] answer = new int[index];
        for(int i = 0; i < strings.length; i++) {
            if(ints.contains(strings[i])){
                answer[dex] = Integer.parseInt(strings[i]);
                dex++;
            }
        }
        answer = stream(answer).sorted().toArray();
        return answer;
    }
}