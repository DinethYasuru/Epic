package Lambda;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
       
        Lambda lam;
        lam = () -> {
            int total=0;
            int arr[]={1,2,3,4,5};
            for (int x=0;x<arr.length;x++) {
                if (arr[x]==5){
                    total=total+5;
                }
                else if(arr[x]%2==0){
                    total++;
                }else
                    total= total+3;
            }
            return total;
        };

        System.out.println(lam.getAge());
        LocalDateTime datentime=LocalDateTime.now();
        System.out.println(datentime);
    }
}
 