import java.util.*;
import java.math.*;
public class EulerPhi {

    static int GCD(int x, int y){

        if (x == 0){
            return y;
        }
        else{
            return GCD(y%x, x);
        }
    }
    public static void main(String[] args) {
        int value1;
        int count = 0;
        
        Scanner sc = new Scanner(System.in);
        value1 = sc.nextInt();
        

        for(int i = 1; i < value1; i++){

            if(GCD(value1, i)==1){
                count++;
            }
            
        }
        System.out.println(count);
    }

}