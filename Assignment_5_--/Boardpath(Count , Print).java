import java.util.*;
public class Main {
    public static void BoardPath(int board_len,int[] arr,ArrayList<String> lst,String str){
        if(board_len==0){
            lst.add(str);
            return;
        }
        if(board_len<0) return;
        for(int i=0;i<arr.length;i++){
            BoardPath(board_len-arr[i],arr,lst,str+""+arr[i]);
        }
    }   
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int board_len=sc.nextInt();
        int dice_face=sc.nextInt();
        int[] arr=new int[dice_face];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        ArrayList<String> lst=new ArrayList<>();
        BoardPath(board_len,arr,lst,"");
        for(int i=0;i<lst.size();i++){
            System.out.print(lst.get(i)+" ");
        }
        System.out.println();
        System.out.println(lst.size());
        sc.close();
    }
}
