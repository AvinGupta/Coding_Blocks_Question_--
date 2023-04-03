import java.util.*;
public class Main{
    public static int Per_DER(int num){
        if(num==1) return 0;
        if(num==2) return 1;
        return (num-1)*(Per_DER(num-2)+Per_DER(num-1));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        int res=Per_DER(val);
        System.out.println(res);
        sc.close();
    }
}
