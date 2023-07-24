package Java_Backtracking;
import java.util.*;
public class Queen_Permutation {
    public static void Permutation(int[] arr,int no_Queen,int placed,String answer){
        if(placed==no_Queen){
            System.out.println(answer);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=1;
                Permutation(arr,no_Queen,placed+1,answer+"b"+i+"Q"+placed+" ");
                //backtrack to previous state.
                arr[i]=0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] board=new int[sc.nextInt()];
        int no_Queen=sc.nextInt();
        Permutation(board,no_Queen,0,"");
        sc.close();
    }
}
