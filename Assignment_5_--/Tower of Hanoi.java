import java.util.*;
public class Main {
    public static void TowerOfHanoi(int num,String src,String hlp,String des){
        if(num==0) return;
        TowerOfHanoi(num-1,src,des,hlp);
        System.out.println("Moving ring "+num+" from "+src+" to "+des);
        TowerOfHanoi(num-1,hlp,src,des);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        TowerOfHanoi(num,"A","C","B");
        sc.close();
    }
}
