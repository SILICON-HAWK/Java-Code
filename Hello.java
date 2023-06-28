import java.util.*;

/*
for(i = 2l i*i <= n; i++){
    for(j = i*i; j<=nl j+=i)
}
*/

public class Hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        boolean arr[] = new boolean[n+1];
        
        for(int a = 2; a < n+1; a++){
            arr[a] = true;
        }

        for(int i = 2; i*i <=n; i++){
            if(arr[i]){
                for(int j = i*i; j<=n; j+=i){
                    arr[j] = false;
                }
            }
        }

        for(int k = 0; k < n+1; k++){
            if(arr[k]){
                System.out.println(k);
            }
        }
    }
}