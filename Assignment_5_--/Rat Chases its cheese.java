import java.util.*;
public class Main {
    static boolean var=false;
    public static void Display_answer(int[][] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void solution(char[][] mze,int curr_rw,int curr_cl,int[][] path){
        if(curr_rw==mze.length-1 && curr_cl== mze[0].length-1){
            if(mze[curr_rw][curr_cl]=='O') {
                var = true;
                path[curr_rw][curr_cl]=1;
                Display_answer(path);
                path[curr_rw][curr_cl]=0;
            }
            return;
        }
        if(curr_rw<0 || curr_rw>=mze.length || curr_cl<0 || curr_cl>=mze[0].length || mze[curr_rw][curr_cl]=='X') return;
        int[] rw={0,-1,0,1};
        int[] cl={1,0,-1,0};
        mze[curr_rw][curr_cl]='X';
        path[curr_rw][curr_cl]=1;
        for (int i=0;i<rw.length;i++){
            solution(mze,curr_rw+rw[i],curr_cl+cl[i],path);
        }
        mze[curr_rw][curr_cl]='O';
        path[curr_rw][curr_cl]=0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        char[][] mze=new char[row][col];
        for(int i=0;i<mze.length;i++){
            String str=sc.next();
            for(int j=0;j<str.length();j++){
                mze[i][j]=str.charAt(j);
            }
        }
        int[][] path=new int[row][col];
        solution(mze,0,0,path);
        if(!var) System.out.println("NO PATH FOUND");
        sc.close();
    }
}
