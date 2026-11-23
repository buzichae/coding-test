class Solution {
    public int solution(int[][] signals) {
        int answer = 0;
        
        // 기존 2개의 신호등만 가능하던 코드 변경 필요
        int[] sumArray = new int[signals.length];
        int smallOne = 100;
        // 각 신호등의 합을 배열에 저장
        for(int i = 0; i < signals.length; i++){
            sumArray[i] = signals[i][0] + signals[i][1] + signals[i][2];
            if(smallOne > sumArray[i]){
                smallOne = sumArray[i];
            }
        }
        
        int lmc = sumArray[0];
        
        for(int i = 1; i < sumArray.length; i++){
            lmc = lmc * sumArray[i] / gcd(lmc, sumArray[i]);
        }
        
        for(int i = 1; i <= lmc; i++){
            boolean all_yellow = true;
            for(int j = 0; j < sumArray.length; j++){
                if(i % sumArray[j] > signals[j][0] && i % sumArray[j] <= signals[j][0] + signals[j][1]){
                    // 만약 노란불이다?
                    all_yellow = true;
                    continue;
                }
                else{
                    all_yellow = false;
                    break;
                }
            }
            if(all_yellow) {
                return i;
            }
        }
        return -1;
        
    }
    
    static int gcd(int a, int b){
        int temp = 0;
        while(b != 0){
            temp = a % b;
            a = b;
            b = temp;
        }
        
        return a;
    }
}