import java.util.*;
public class Main {
    public static void Generate_Bin(String str,ArrayList<String> lst){
        if(str.indexOf("?")==-1){
            if(lst.contains(str)) return;
            lst.add(str);
            return;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='?'){
                String  s1=str.substring(0,i);
                String s2=str.substring(i+1);
                Generate_Bin(s1+"0"+s2,lst);
                Generate_Bin(s1+"1"+s2,lst);
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            String str=sc.next();
            ArrayList<String> lst=new ArrayList<>();
            Generate_Bin(str,lst);
            for(int i=0;i<lst.size();i++){
                System.out.print(lst.get(i)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
