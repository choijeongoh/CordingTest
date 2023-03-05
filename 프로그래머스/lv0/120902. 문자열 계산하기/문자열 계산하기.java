class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] ans = my_string.split(" ");
        answer = Integer.parseInt(ans[0]);
        for (int i = 0; i < ans.length; i++) {
            if(i % 2 != 0){
                if(ans[i].equals("+")){
                    answer += Integer.parseInt(ans[i+1]);
                } else if(ans[i].equals("-")) {
                    answer -= Integer.parseInt(ans[i+1]);
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}