import java.util.*;
public class Main {
    public static void Subset_Sum(int[] arr,int tar,int ind,ArrayList<Integer> lst,ArrayList<ArrayList<Integer>> lst_1){
        if(ind==arr.length){
            if(lst_1.contains(lst)) return;
            int sum=0;
            for(int i=0;i<lst.size();i++){
                sum+=lst.get(i);
            }
            if(sum==tar) lst_1.add(new ArrayList<>(lst));
            return;
        }
        Subset_Sum(arr,tar,ind+1,lst,lst_1);
        lst.add(arr[ind]);
        Subset_Sum(arr,tar,ind+1,lst,lst_1);
        lst.remove(lst.size()-1);
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
        ArrayList<Integer> lst=new ArrayList<>();
        ArrayList<ArrayList<Integer>> lst_1=new ArrayList<>();
        Subset_Sum(arr,target,0,lst,lst_1);
        for(int i=lst_1.size()-1;i>=0;i--){
            Print(lst_1.get(i));
        }
        System.out.println();
        System.out.println(lst_1.size());
        sc.close();
    }
    public static void Print(ArrayList<Integer> ans){
        for(int i=0;i<ans.size();i++){
             System.out.print(ans.get(i)+" ");
        }
         System.out.print(" ");
    }
}
