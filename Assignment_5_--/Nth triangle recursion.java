import java.util.*;
public class Main {
    public static int Nth_tri(int nums){
        if(nums==0) return 0;
        return nums+Nth_tri(nums-1);
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        System.out.println(Nth_tri(nums));
        sc.close();
    }
}
