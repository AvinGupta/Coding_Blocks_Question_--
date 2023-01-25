import java.util.*;
public class Main {
    public static void Maze_Path(int[][] arr,ArrayList<String> lst,String str,int row,int col){
        if(row==arr.length-1 && col==arr[0].length-1){
            lst.add(str);
            return;
        }
        if(row<arr.length) Maze_Path(arr,lst,str+'V',row+1,col);
        if(col<arr[0].length) Maze_Path(arr,lst,str+'H',row,col+1);
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        ArrayList<String> lst=new ArrayList<>();
        Maze_Path(arr,lst,"",0,0);
        for(int i=0;i<lst.size();i++){
            System.out.print(lst.get(i)+" ");
        }
        System.out.println();
        System.out.println(lst.size());
        sc.close();
    }
}
