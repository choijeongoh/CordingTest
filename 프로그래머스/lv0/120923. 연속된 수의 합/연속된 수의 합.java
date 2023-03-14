class Solution {
     public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int plus = total / num;
        int s= -((num - 1) / 2);
        if(total % num == 0) {
            for(int i = 0; i < num; i++) {
                answer[i] = plus + s;
                s++;
                System.out.println(answer[i]);
            }
        } else if (total % num != 0) {
            for(int i = 0; i < num; i++) {
                answer[i] = plus + s;
                s++;
                System.out.println(answer[i]);
            }
        }

        return answer;
    }
}