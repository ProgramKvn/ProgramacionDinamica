package Técnicas;

public class Recursividad {

    public static int Recursividad(int n){
        n = java.lang.Math.abs(n);
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return Recursividad(n-1) + Recursividad(n-2);
        }
    }
}
