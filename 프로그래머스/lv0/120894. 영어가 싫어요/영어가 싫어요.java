import java.util.HashMap;
import java.util.Map;

class Solution {
       public static long solution(String numbers) {
        long answer = 0;
        int ans = 10;
        String[] num = numbers.split("");
        String n = "";

        Map<String, Long> map = new HashMap<>();
        map.put("zero", 0L);
        map.put("one", 1L);
        map.put("two", 2L);
        map.put("three", 3L);
        map.put("four", 4L);
        map.put("five", 5L);
        map.put("six", 6L);
        map.put("seven", 7L);
        map.put("eight", 8L);
        map.put("nine", 9L);

        for(int i = 0; i < numbers.length(); i++) {
            n += num[i];
            if(map.getOrDefault(n, 10L) != 10L) {
                answer = (answer * ans) + map.get(n);
                n = "";
            }
        }
        
        System.out.println(answer);
        return answer;
    }
}