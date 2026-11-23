class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++) {
            Character al = myString.charAt(i);
            if(al == 'a' || al == 'A') {
                answer += Character.toUpperCase(al);
            } else {
                answer += Character.toLowerCase(al);
            }
        }
        return answer;
    }
}