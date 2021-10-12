import java.util.*;

public class Potions {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long [] arr = new long[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextLong();
        }
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int count = 0;
        long pos = 0;
        long negt = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] >= 0){
                count++;
                pos += arr[i];
            }else{
                if(pos >= negt + Math.abs(arr[i])){
                    negt += Math.abs(arr[i]);
                    pq.add(arr[i]);
                }else{
                    if(pq.size() == 0){
                        continue;
                    }
                    long temp = Math.abs(pq.peek());
                    if(temp > Math.abs(arr[i])){
                        pq.remove();
                        negt = negt - temp + Math.abs(arr[i]);
                        pq.add(arr[i]);
                    }
                }
            }
        }
        System.out.println(count + pq.size());
    }
}
