import java.util.Scanner;

public class Closettox {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        int i = 0; int j = arr.length -1;
        int gap = Integer.MAX_VALUE;
        int n1 = 0; int n2 = 0;
        while(i < j){
            if(arr[i] + arr[j] < k){
                int val = Math.abs(k - (arr[i] + arr[j]));
                if(val < gap){
                    n1 = arr[i];
                    n2 = arr[j];
                    gap = val;
                }
                i++;
            }else{
                int val = Math.abs(k - (arr[i] + arr[j]));
                if(val < gap){
                    n1 = arr[i];
                    n2 = arr[j];
                    gap = val;
                }
                j--;
            }
        }
        System.out.println(n1 + " " + n2);
    }
}
