package Técnicas;


public class BottomUp {
    
    public static int BottomUp(int n){
        n = java.lang.Math.abs(n);
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int[] BUp = new int[n + 1];
        BUp[1] = 1;
        BUp[2] = 1;
        for(int i = 2; i<=(n); i++){
            BUp[i] = BUp[i-1] + BUp[i-2]; 
        }
        return BUp[n];
    }
}
