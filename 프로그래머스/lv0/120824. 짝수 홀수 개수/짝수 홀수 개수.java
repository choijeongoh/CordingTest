class Solution {
    public int[] solution(int[] num_list) {
       int[] answer = new int[2];
        int s = 0;
        int v = 0;
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0){
                s++;
                answer[0] = s;
            } else if (num_list[i] % 2 != 0) {
                v++;
                answer[1] = v;
            }
        }
        System.out.println(answer[0] + ", " + answer[1]);
        return answer;
    }
}