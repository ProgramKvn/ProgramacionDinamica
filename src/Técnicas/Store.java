package Técnicas;
import static Técnicas.Recursividad.Recursividad;
public class Store {

public static int Store(int n, int Store){
    n = java.lang.Math.abs(n);
    if(Store != 0){
        return Store;
    }else if(n == 0){
        return 0;
    }else if(n == 1){
        return 1;
    }else{
        int result = Recursividad(n-1) + Recursividad(n-2);
        Store = result;
    }
    return Store;
}  
}
