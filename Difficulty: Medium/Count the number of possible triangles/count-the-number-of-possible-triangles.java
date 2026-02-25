/*class Solution {
    public int countTriangles(int arr[]) {
        // O(n^3)
        // not optimised
        int c=0;
        Arrays.sort(arr); 
        
        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1; j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if((arr[i]+arr[j])>arr[k])
                        c++;
                }
            }
            
        }
        return c;
    }
}
*/


class Solution {
    public int countTriangles(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        //o(n^2)
        // Fix the largest side one by one
        for (int k = n - 1; k >= 2; k--) //k>=2 to have 3 elements
        {
            int i = 0, j = k - 1; // fix first and before k
            while (i < j) 
            {
                if (arr[i] + arr[j] > arr[k]) 
                {
                    // All pairs (i...j-1, j) will form a triangle
                    count += (j - i);
                    j--;
                } 
                else 
                {
                    i++;
                }
            }
        }
        
        return count;
    }
}