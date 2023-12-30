import java.util.*;
public class Main {
	public static int tab(int n,int w,int[] wt,int[] val){
		int[][] dp=new int[n+1][w+1];
        for(int i=0; i<w+1; i++) dp[0][i] = 0;
        for(int j=0; j<n+1; j++) dp[j][0] = 0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                if(j>=wt[i-1]){
                    dp[i][j]=Math.max((val[i-1]+dp[i-1][j-wt[i-1]]),dp[i-1][j]);
                }
                else if(j<wt[i-1]){
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][w];
	}
	public static int helper(int n,int w,int[] wt,int[] val,int[][] dp){
		if(n==0 || w==0){
			return 0;
		}
		if(dp[n][w]!=-1) return dp[n][w];

		if(wt[n-1]<=w){
			return dp[n][w]=Math.max(val[n-1]+helper(n-1,w-wt[n-1],wt,val,dp),helper(n-1,w,wt,val,dp));
		}
		return dp[n][w]=helper(n-1,w,wt,val,dp);
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int w=sc.nextInt();
		int[] wt=new int[n];
		int[] val=new int[n];
		for(int i=0;i<wt.length;i++) wt[i]=sc.nextInt();
		for(int i=0;i<val.length;i++) val[i]=sc.nextInt();
		int[][] dp=new int[n+1][w+1];
		for(int[] x:dp){
			Arrays.fill(x,-1);
		}
		// System.out.println(helper(n,w,wt,val,dp));
		System.out.println(tab(n,w,wt,val));
		sc.close();
    }
}
