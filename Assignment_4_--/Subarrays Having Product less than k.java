//SubArray_Havig product_less_than_k
import java.util.Scanner;
public class Main {
    public static void product_less_than_k(int[] arr,int tar){
        int spt=0;
        int ept=0;
        int ans=0;
        int prod=1;
        while(ept<arr.length){
            //grow the window
            prod*=arr[ept];
            //shrink the window according to the conditions
            while(prod>=tar && spt<=ept){
                prod/=arr[spt];
                spt++;
            }
            //calculate the ans
            ans+=(ept-spt+1);
            //increase the counter
            ept++;
        }
        System.out.println(ans);
    }
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        //declaring array of size n.
        int[] arr=new int[size];
        int tar=sc.nextInt();
        for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
        product_less_than_k(arr,tar);
        sc.close();
    }
}
