class Solution {
    public int solution(int num, int k) {
int answer = 0;
        String ans = String.valueOf(num);
        String kk = String.valueOf(k);
        String[] ex = ans.split("");
        for(int i = 0; i < ans.length(); i++) {
            if (ex[i].equals(kk)) {
                answer = i+1;
                break;
            }
            if(!ex[i].equals(kk)) {
                answer = -1;
            }
        }return answer;
    }
}