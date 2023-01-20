import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            String str=sc.next();
            System.out.println(str.replace("pi","3.14"));
        }
        sc.close();
    }
}
