//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
          int n=S.length();
		int prev[]=new int[n+1];
		int cur[]=new int[n+1];
		    
		for(int i=n;i>=0;i--){
		    for(int j=n;j>=0;j--){
		        if(i==n || j==n)
		            cur[j]=0;
		        else if(S.charAt((n-1)-i)==S.charAt(j)){
		                cur[j]=1+prev[j+1];
		        } else 
		            cur[j]=Math.max(prev[j],cur[j+1]);
		    }
		        prev=cur.clone();
	    }
		return prev[0];
    
    }
}