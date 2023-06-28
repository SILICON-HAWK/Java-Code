import java.util.*;

public class StroboNum {
    public static void main(String[] args) {
        boolean ans = true;
        Scanner sc = new Scanner(System.in);
        String str = "";
        str = sc.nextLine();
        int lo = 0;
        int hi = str.length()-1;
        while(lo <= hi){
            if(str.charAt(lo) == '1' && str.charAt(hi) == '1'){
                lo++;
                hi--;
            }

            else if(str.charAt(lo) == '8' && str.charAt(hi) == '8'){
                lo++;
                hi--;
            }
            else if(str.charAt(lo) == '0' && str.charAt(hi) == '0'){
                lo++;
                hi--;
            }

            else if(str.charAt(lo)=='6' && str.charAt(hi) == '9'){
                lo++;
                hi--;
            }
            else if(str.charAt(hi)=='6' && str.charAt(lo) == '9'){
                lo++;
                hi--;
            }

            else{
                ans = false;
                // System.out.println("false");
                break;
            }

        }

        if( ans == false){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
}
