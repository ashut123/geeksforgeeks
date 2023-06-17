//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Geeks{
    static void insert(Queue<Integer> q, int k){
        q.offer(k);
    }
    static int findFrequency(Queue<Integer> q, int k){
        int ans=0,size=q.size();
        for (int i=0;i<size;i++){
            int x=q.poll();
            if (x==k) ans++;            
            q.offer(x);
        }
        return (ans==0?-1:ans);
    }
}

//{ Driver Code Starts.

// Driver class with driver code
class GFG {
    
    // Driver code
	public static void main (String[] args) {
		
		// Taking input using scanner class
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    // Declaring Queue
		    Queue<Integer> q = new LinkedList<>();
		    int n = sc.nextInt();
		    
		    // Invoking object of Geeks class
		    Geeks obj = new Geeks();
		    
		    for(int i = 0;i<n;i++){
		        int k = sc.nextInt();
		        obj.insert(q, k);
		    }
		   
		    int x = sc.nextInt();
		    for(int i = 0;i<x;i++){
		        int k = sc.nextInt();
		        int f = obj.findFrequency(q, k);
		        if(f != 0){
		            System.out.println(f);
		        }
		        else{
		            System.out.println("-1");
		        }
		    }
		}
	}
}
// } Driver Code Ends