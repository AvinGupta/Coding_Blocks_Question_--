import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0) {
			int n=sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0;i<arr.length;i++) arr[i] = sc.nextInt();
			nextLarger(arr);
		}
	}
	public static void nextLarger(int[] arr) {
		int[] ans=new int[arr.length];
		Stack<Integer> stk=new Stack<>();
		for(int i=0;i<arr.length;i++){
			while(!stk.isEmpty() && arr[i]>arr[stk.peek()]){
				int var=stk.pop();
				ans[var]=arr[i];
			}
			stk.push(i);
		}
		while(!stk.isEmpty()){
			int var=stk.pop();
			ans[var]=-1;
		}
		for(int i=0;i<ans.length;i++) System.out.println(arr[i]+","+ans[i]);
	}
}
