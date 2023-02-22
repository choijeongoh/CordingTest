import java.util.HashMap;
class Solution {
    public static String solution(int age) {
        HashMap<Integer, String> map = new HashMap<>();
        String answer = " ";
        int a = 97;
        for (int i = 0; i < 10; i++) {
             String abc = String.valueOf((char) (a+i));
            map.put(i, abc);
        }
        if(age < 10) {
            answer = map.get(age);
        } else if (10 <= age && age < 100) {
            answer = map.get(age/10) + map.get(age % 10);
        } else if (100 <= age && age < 1000) {
            answer = map.get(age/100) + map.get((age % 100)/10) + map.get(age % 10);
        } else if (age == 1000) {
            answer = map.get(age/1000) + map.get(0) + map.get(0) + map.get(0);
        }
        System.out.println(answer);
        return answer;
    }
}