class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int ps=arr[i]+arr[j];
            if(ps>target)
            j--;
            else if(ps<target)
            i++;
            else return true;
        }
        return false;
        
        
        
        
        
        
        
        
        
        /*
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                return true;
            }
        }
        return false;
        */
    }
}