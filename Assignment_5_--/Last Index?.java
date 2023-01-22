import java.util.*;
public class Main {
    public static int Lst_Index(int[] arr,int target,int ind){
        if(ind<0) return -1;
        if(arr[ind]==target) return ind;
        return Lst_Index(arr,target,ind-1);
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int ans=Lst_Index(arr,target,arr.length-1);
        System.out.println(ans);
        sc.close();
    }
}
