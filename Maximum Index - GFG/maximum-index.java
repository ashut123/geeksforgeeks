//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxIndexDiff(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int maxIndexDiff(int[] arr, int n) {
        int i=0,j=n-1,big=0;
        while(i<j)
        {
            if(arr[i]<=arr[j])
            {
                big=Math.max(big,j-i);
                i++;
                j=n-1;
            }
            else
            {
                j--;
            }
        }
        return big;
    }
}

    
