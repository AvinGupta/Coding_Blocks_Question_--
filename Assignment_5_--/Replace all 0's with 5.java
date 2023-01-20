import java.util.*;
public class Main {
    public static int Replace(int num){
        if(num==0) return 0;
        int ans=num%10;
        if(ans==0) ans=5;
        return ans+Replace(num/10)*10;
    }
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=Replace(num);
        System.out.println(ans);
        sc.close();
    }
}
