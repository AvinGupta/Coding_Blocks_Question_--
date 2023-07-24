package Java_Backtracking;
import java.util.Scanner;
public class Queen_Combination {
    public static void Combination(int[] arr,int no_Queen,int placed,String answer,int ind){
        if(placed==no_Queen){
            System.out.println(answer);
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=1;
                Combination(arr,no_Queen,placed+1,answer+"b"+i+"Q"+placed,i+1);
                arr[i]=0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int board_size=sc.nextInt();
        int[] board=new int[board_size];
        int no_Queen=sc.nextInt();
        Combination(board,no_Queen,0,"",0);
        sc.close();
    }
}
