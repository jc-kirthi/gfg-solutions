
class Solution {
    public String average(int arr[]) {
        // code here
        double sum=0;
        for(int i: arr)
            sum+=i;
        double avg =sum/arr.length;  
        return String.format("%.2f", avg);
    }
}

/*
 DecimalFormat df = new DecimalFormat("0.00");
        return df.format(avg);
        */