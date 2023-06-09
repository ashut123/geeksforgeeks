//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends



class Solution {
    public List<String> find_permutation(String S) {
        List<String> result = new ArrayList<>();
        char[] chars = S.toCharArray();
        backtrack(chars, 0, result);
        Collections.sort(result);
        return result;
    }

    private void backtrack(char[] chars, int start, List<String> result) {
        if (start == chars.length - 1) {
            result.add(new String(chars));
            return;
        }

        for (int i = start; i < chars.length; i++) {
            if (shouldSwap(chars, start, i)) {
                swap(chars, start, i);
                backtrack(chars, start + 1, result);
                swap(chars, start, i); // backtrack
            }
        }
    }

    private boolean shouldSwap(char[] chars, int start, int current) {
        for (int i = start; i < current; i++) {
            if (chars[i] == chars[current]) {
                return false;
            }
        }
        return true;
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
