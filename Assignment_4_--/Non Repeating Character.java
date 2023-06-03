import java.util.Scanner;
public class Main {
    public static int solution(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[(s.charAt(i)-97)]++;
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-97]==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            String str=sc.next();
            int ans=solution(str);
            if(ans!= -1){
                System.out.println(str.charAt(ans));
            }
            else{
                System.out.println("-1");
            }
        }
        sc.close();
    }
}
