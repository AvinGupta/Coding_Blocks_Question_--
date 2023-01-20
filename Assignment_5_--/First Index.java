import java.util.*;
public class Main {
    public static int Search(int[] arr,int target,int ind){
        if(ind==arr.length){
            return -1;
        }
        if(arr[ind]==target) return ind;
        return Search(arr,target,ind+1);
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
        int ans=Search(arr,target,0);
        System.out.println(ans);
        sc.close();
    }
}
